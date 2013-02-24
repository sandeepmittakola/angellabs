package co.angellabs.controllers.profile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
import co.angellabs.profileservices.service.UserBasicServices;


@Controller
@RequestMapping("/Message")
@SessionAttributes("user")

public class MessageController   {

	@Autowired
	private UserBasicServices userBasicServices;
	
	@Autowired
	private BaseMailService baseMailService;
	
	@Autowired
	private UserMessageServices userMessageServices;
	/*
	 * Messege controlling
	 */

	@RequestMapping(value="/messages.htm", method=RequestMethod.GET)
	public ModelAndView messages(@ModelAttribute User user) {
		ModelMap model = new ModelMap();
	
		System.out.println("i am in controller......."+user.getUserId());
		
		List messages=(List) userMessageServices.getInbox(user.getUserId());
		
		model.addAttribute("messages",messages);
		
		return new ModelAndView("messages",model);
	}
	
}


