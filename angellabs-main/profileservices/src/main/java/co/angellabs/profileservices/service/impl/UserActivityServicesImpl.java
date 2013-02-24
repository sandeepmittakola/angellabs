package co.angellabs.profileservices.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import co.angellabs.entities.dto.UserCompanyRoles;
import co.angellabs.profileservices.dao.UserActivityServicesDAO;

import co.angellabs.profileservices.service.UserActivityServices;

public class UserActivityServicesImpl implements UserActivityServices 
{
	@Autowired
	private UserActivityServicesDAO userActivityServiceDAO;
	
	public List<UserCompanyRoles> getActivities(int userId){
		return userActivityServiceDAO.getActivites(0);
	}
}
