package co.angellabs.profileservices.dao;

import java.util.List;


import co.angellabs.entities.dto.UserCompanyRoles;

public interface UserActivityServicesDAO {

	public List<UserCompanyRoles> getActivites(int userId);
}
