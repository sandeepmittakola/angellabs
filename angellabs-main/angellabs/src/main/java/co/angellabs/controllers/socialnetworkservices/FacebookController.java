package co.angellabs.controllers.socialnetworkservices;

import java.util.List;

import javax.inject.Inject;

import org.springframework.social.facebook.api.Facebook;
import org.springframework.social.facebook.api.FacebookProfile;
import org.springframework.social.facebook.api.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
/*@RequestMapping("/Facebook")*/
public class FacebookController {

	//byte[] userProfileImage = null;
@Inject
private final Facebook facebook;

@Inject
public FacebookController(Facebook facebook) {
	this.facebook = facebook;
}
public String getByteArrayString(byte[] userProfileImage)
{
   return new String(userProfileImage);
}

@RequestMapping(value = "/", method = RequestMethod.GET)
public String home(Model model) {
	List<Reference> friends = facebook.friendOperations().getFriends();
	String email = facebook.userOperations().getUserProfile().getEmail();
	String firstName = facebook.userOperations().getUserProfile().getFirstName();
	String homeTown = facebook.userOperations().getUserProfile().getHometown().getName();
	String name = facebook.userOperations().getUserProfile().getName();
	
	FacebookProfile profile = facebook.userOperations().getUserProfile();
	byte[] userProfileImage = facebook.userOperations().getUserProfileImage();
	getByteArrayString(userProfileImage);
	
	model.addAttribute("profile",profile);
	model.addAttribute("image",getByteArrayString(userProfileImage));
	
	model.addAttribute("friends", friends);
	model.addAttribute("email",email);
	model.addAttribute("firstName",firstName);
	model.addAttribute("homeTown",homeTown);
	model.addAttribute("name",name);
			
	return "userRegistration";
}

}
