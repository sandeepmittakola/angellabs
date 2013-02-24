package co.angellabs.profileservices.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import co.angellabs.entities.dto.User;
import co.angellabs.profileservices.dao.UserBasicServicesDAO;
import co.angellabs.profileservices.service.UserBasicServices;


public class UserBasicServicesImpl implements UserBasicServices {

	@Autowired
	private UserBasicServicesDAO userBasicServiceDAO;
	
	public User validateUser(int user_id) {

		User user=userBasicServiceDAO.validateUser(user_id);
		return user;
	}

	public boolean register(User user) {
		boolean isReg=userBasicServiceDAO.saveUser(user);
		return isReg;
	}

	public void changeUserByMail(String email,String password) {

		userBasicServiceDAO.changePasswordByMail(email,password);
		
	}

	public String getPasswordbyMail(String email) {

		String password = userBasicServiceDAO.getPaswordByMail(email);
		return password;
	}
	
}
