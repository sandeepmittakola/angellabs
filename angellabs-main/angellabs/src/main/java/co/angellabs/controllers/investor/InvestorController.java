package co.angellabs.controllers.investor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping("/Investor")
public class InvestorController {
	
	/*
	 *investor homepage 
	 * 
	 */
	@RequestMapping(value="/investorHome.htm",method=RequestMethod.GET)
	public String invHome(){
		return null;
	}
	
	/*
	 * Investor application 
	 */
	
	@RequestMapping(value="/invApply.htm", method=RequestMethod.GET)
	public ModelAndView invApply(ModelMap model){
		return new ModelAndView("invHome",model);
	}
}

