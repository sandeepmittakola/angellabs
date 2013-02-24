package co.angellabs.mailservices.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


import co.angellabs.entities.dto.Message;
import co.angellabs.mailservices.dao.UserMessageServicesDAO;

public class UserMessageServicesDAOImpl implements UserMessageServicesDAO {

	
	@Autowired
	private SessionFactory mailSessionFactory;
	
	
	@Transactional
	public List getInbox(int userId) {
		// TODO Auto-generated method stub
		
		Session session=mailSessionFactory.getCurrentSession();
		
		Criteria cr = session.createCriteria(Message.class);
	    cr.add(Restrictions.eq("toAddress", userId));
		System.out.println("*******************************************"+userId);
		List message = (List) cr.list();
		
	    System.out.println("**************************************"+message.size());
		
	      return message;
	}

	public List getSentMessages(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public void sendMessage(Message message) {
		// TODO Auto-generated method stub
		
		Session session=mailSessionFactory.getCurrentSession();
		session.save(message);
		
	}

}
