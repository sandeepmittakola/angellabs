package co.angellabs.controllers.profile;

import java.util.List;

import net.sf.json.JSONArray;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import co.angellabs.entities.dto.User;
import co.angellabs.entities.dto.UserCompanyRoles;
import co.angellabs.profileservices.service.UserActivityServices;

@Controller
@RequestMapping("/UserActivity")
public class UserActivityController {

	protected static Logger logger = Logger.getLogger("userActivityController");

	@Autowired
	private UserActivityServices userActivityservice;

	/*
	 * User Activities controlling
	 */

	@RequestMapping(value = "/useractivities.htm", method = RequestMethod.GET)
	public ModelAndView loaduserActivities() {
		ModelMap modelMap = new ModelMap();
		System.out.println("load userActivities");
		// int userId = Integer.parseInt(userIdStr);
		//List<UserCompanyRoles> useractivities = userActivityservice				.getActivities(1);
		//modelMap.addAttribute("useractivitylist", useractivities);
		//return new ModelAndView("activity", modelMap);
		return new ModelAndView("activity", modelMap);
	}
	@RequestMapping(value = "/getActivities.htm", method = RequestMethod.POST)
	public @ResponseBody String userActivities() {
		List<UserCompanyRoles> useractivities = userActivityservice.getActivities(2);
		JSONArray mJSONArray = JSONArray.fromObject(useractivities);
		return mJSONArray.toString();
		//return useractivities;
	}
}
