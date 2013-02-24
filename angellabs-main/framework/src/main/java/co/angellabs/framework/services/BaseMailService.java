package co.angellabs.framework.services;

import co.angellabs.entities.dto.Message;
import co.angellabs.entities.dto.User;

public interface BaseMailService {
	
	void sendConfirmMail(User user);
	void sendNewPassword(String email, String password);

}
