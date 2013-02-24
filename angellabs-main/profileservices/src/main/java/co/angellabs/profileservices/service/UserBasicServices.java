package co.angellabs.profileservices.service;

import co.angellabs.entities.dto.User;

public interface UserBasicServices  {

	public User validateUser(int user_id);
	
	public boolean register( User user);
	
	public void changeUserByMail(String email,String password);

	public String getPasswordbyMail(String email);
}
