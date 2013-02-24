package co.angellabs.profileservices.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import co.angellabs.entities.dto.User;

import co.angellabs.profileservices.dao.UserBasicServicesDAO;


public class UserBasicServicesDAOImpl implements UserBasicServicesDAO  {

	@Autowired
	private SessionFactory profileSessionFactory;
	
	
	
	@Transactional
	public boolean saveUser(User user) {
		
		profileSessionFactory.getCurrentSession().save(user);
		return true;

	}
	@Transactional
	public User validateUser(int user_id) {

		String sqlqry="UPDATE users SET enabled=1 WHERE user_id="+user_id+"";
		SQLQuery query = profileSessionFactory.getCurrentSession().createSQLQuery(sqlqry);
		query.executeUpdate();
		Object obj=profileSessionFactory.getCurrentSession().get(User.class, user_id);
		
		return (User)obj;
	}
	
	@Transactional
	public void changePasswordByMail(String email,String password) {
		System.out.println("...............eamil   password......"+email+"....."+password);
		String sqlqry="UPDATE USERS SET PASSWORD='"+password+"' WHERE EMAIL='"+email+"'";
		SQLQuery query = profileSessionFactory.getCurrentSession().createSQLQuery(sqlqry);
		query.executeUpdate();
	}
	
	@Transactional
	public String getPaswordByMail(String email) {
		
	
		Query query = profileSessionFactory.getCurrentSession().createSQLQuery(
				"select s.password from users s where s.email = :email")
				.setParameter("email", email);
				 return (String) query.list().iterator().next();
		
	
	}

	
	

}
