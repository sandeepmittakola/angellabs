package co.angellabs.mailservices.service.impl;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import co.angellabs.entities.dto.Message;
import co.angellabs.entities.dto.User;
import co.angellabs.mailservices.service.UserMessageServices;
import co.angellabs.mailservices.dao.UserMessageServicesDAO;
import co.angellabs.profileservices.dao.DefaultUserDAO;

public class UserMessageServicesImpl implements UserMessageServices{

	@Autowired
	private UserMessageServicesDAO userMessageServiceDAO;
	
	@Autowired
	private DefaultUserDAO defaultUserDAO;
	
	
	public List getInbox(int userId) {
		// TODO Auto-generated method stub
		System.out.println("inside serviuce layer.............."+userId);
		
		List messages= userMessageServiceDAO.getInbox(userId);
		
		Iterator<Message> iterator = messages.iterator(); 
		
		while (iterator.hasNext()){
			
			Message message=iterator.next();
			
		    message.setUser(defaultUserDAO.getUser(message.getFromAddress()) );
		  
		   	
		}
		
		
		return messages;
		
	}

	public List getSentMessages(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void sendMessage(Message message) {
		// TODO Auto-generated method stub
		
		 userMessageServiceDAO.sendMessage(message);
		
	}

}
