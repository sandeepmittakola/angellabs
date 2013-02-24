package co.angellabs.mailservices.service;

import java.util.List;

import co.angellabs.entities.dto.Message;



public interface UserMessageServices {

List getInbox(int userId);
	
List getSentMessages(int userId);

void sendMessage(Message message);
	
}
