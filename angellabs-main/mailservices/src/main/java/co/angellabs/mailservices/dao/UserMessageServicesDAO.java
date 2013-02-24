package co.angellabs.mailservices.dao;

import java.util.List;

import co.angellabs.entities.dto.Message;



public interface UserMessageServicesDAO {
	
	List getInbox(int userId);
	
	List getSentMessages(int userId);
	
	void sendMessage(Message message);

}
