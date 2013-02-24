package co.angellabs.entities.dto;

import java.io.Serializable;

public class UserCompanyRoles implements Serializable{

	

	private long userId; 
	
	private long companyId;
	
	private long roleId;
	
	private  User user;
	
	private Roles roles;
	
	private  Company company;
	
	 private String createdDate;
	 
	 private int days;
	 
	 public User getUser()
	 {
		 return user;
	 }
	 
	 public void setUser(User user)
	 {
		 this.user= user;
	 }

	public Roles getRoles() {
		return roles;
	}

	public void setRoles(Roles roles) {
		this.roles = roles;
	}

	

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	
	

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}

	public long getRoleId() {
		return roleId;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}
	 
}
 