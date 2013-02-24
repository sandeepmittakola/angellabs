package co.angellabs.controllers.profile;

import java.security.Principal;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import co.angellabs.entities.dto.Message;
import co.angellabs.entities.dto.User;
import co.angellabs.framework.controller.AuthenticationController;
import co.angellabs.framework.services.BaseMailService;
import co.angellabs.mailservices.service.UserMessageServices;
import co.angellabs.profileservices.dao.DefaultUserDAO;
import co.angellabs.profileservices.service.DefaultService;
import co.angellabs.profileservices.service.UserBasicServices;

@Controller
@RequestMapping("/User")
@SessionAttributes("user")
public class UserController extends AuthenticationController  {

	@Autowired
	private UserBasicServices userBasicServices;
	
	@Autowired
	private BaseMailService baseMailService;
	
	@Autowired
	private UserMessageServices userMessageServices;
	/*
	 * Login controlling
	 */
	
	@RequestMapping(value="/login.htm", method=RequestMethod.GET)
	public ModelAndView loginPage() {
		ModelMap model = new ModelMap();
		
		return new ModelAndView("login",model);
	}
	
	@Autowired
	private DefaultService defaultService;
	@RequestMapping(value="/afterLogin.htm",method=RequestMethod.GET)
	
	public ModelAndView afterlogin(ModelMap model,Principal principal,HttpServletRequest request)
	{
		String email = principal.getName();
		User user=defaultService.findUserByEmail(email);
		HttpSession session = request.getSession();
		session.setAttribute("user", user);
		model.addAttribute("user",user);
		return new ModelAndView("index",model);
	}
	
	
	@RequestMapping(value="/validateUser.htm",method=RequestMethod.GET)
	public ModelAndView validateUserLogin(HttpServletRequest request,
			HttpServletResponse response,ModelMap model) {
		int user_id=Integer.parseInt(request.getParameter("AccNo"));
		User user=userBasicServices.validateUser(user_id);
		
		HttpSession session = request.getSession();
		session.setAttribute("user", user);
		return new ModelAndView("index",model);
	}

	
	
	/*
	 * Registering operation
	 */
	@RequestMapping(value="/register.htm", method=RequestMethod.GET)
	public ModelAndView joinUser(@ModelAttribute("register") User user, ModelMap model) {
		
		
		
		return new ModelAndView("userRegistration",model);
	}
		

	/*
	 *mail sending after registration
	 */
	@RequestMapping(value="/adduser.htm",method=RequestMethod.GET)
	public ModelAndView addUser(User user, ModelMap model) {
		
			boolean isReg = userBasicServices.register(user);
			baseMailService.sendConfirmMail(user);
			Message message=new Message();
			message.setToAddress(user.getUserId());
			message.setSubject("welcome to angellabs");
			message.setContent("greeting from angellabs");
			message.setDate(new Date());
			message.setFromAddress(1);
			userMessageServices.sendMessage(message);
			return new ModelAndView("userRegistration1",model);
	}
	@RequestMapping()	
	public ModelAndView deleteUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/*
	 * forgot password operation
	 */	
	@RequestMapping(value="/forgotPassword.htm",method=RequestMethod.GET)
	public String forgetPassword(){
		return "forgotPassword";
	}
	@RequestMapping(value="/newPassword.htm",method=RequestMethod.GET)
	public ModelAndView newPassword(@ModelAttribute("chanage") User user ,ModelMap model){
		
		String email=user.getEmail();
		String password =userBasicServices.getPasswordbyMail(email);
		//userBasicServices.changeUserByMail(email,password);
		baseMailService.sendNewPassword(email,password);
		
		model.addAttribute("send",true);
		return new  ModelAndView("forgotPassword",model);	
	}
	
	
	

}
