package co.angellabs.profileservices.service;

import java.util.List;


import co.angellabs.entities.dto.UserCompanyRoles;

public interface UserActivityServices {
	
	public List<UserCompanyRoles> getActivities(int userId);

}
