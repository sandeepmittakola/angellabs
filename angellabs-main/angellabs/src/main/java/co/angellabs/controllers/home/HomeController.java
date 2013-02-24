package co.angellabs.controllers.home;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import co.angellabs.entities.dto.User;
import co.angellabs.framework.controller.BaseController;



@Controller
@RequestMapping("/Home")
public class HomeController implements BaseController {
	
			
	@RequestMapping(value="/index.htm",method=RequestMethod.GET)
	public String homePage() {
		ModelMap model = new ModelMap();
		return "index";
	}
	
	
/*search operarations*/

	
	public String aboutUs() {
		// TODO Auto-generated method stub
		return null;
	}

	public String help() {
		// TODO Auto-generated method stub
		return null;
	}

	public ModelAndView getReviews() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getBlog() {
		
		return null;
	}

	public ModelAndView signUpWithTwitter() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getApi() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getTermsandConditions() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
