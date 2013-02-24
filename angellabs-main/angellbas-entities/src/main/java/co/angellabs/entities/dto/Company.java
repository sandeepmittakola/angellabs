package co.angellabs.entities.dto;

public class Company {
	
	private long companyId;
	
	private String companyName;
	
	private byte[]  companyLogo;
	
	private String website;
	
	private String highConnectPitch;
	
	private int companytypeId;
	
	private int companysizeId;
	
	private int companylocationId;
	
	private String createdDate;
	
	
	

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public int getCompanytypeId() {
		return companytypeId;
	}

	public void setCompanytypeId(int companytypeId) {
		this.companytypeId = companytypeId;
	}

	public int getCompanysizeId() {
		return companysizeId;
	}

	public void setCompanysizeId(int companysizeId) {
		this.companysizeId = companysizeId;
	}

	public int getCompanylocationId() {
		return companylocationId;
	}

	public void setCompanylocationId(int companylocationId) {
		this.companylocationId = companylocationId;
	}

	public long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}



	public byte[] getCompanyLogo() {
		return companyLogo;
	}

	public void setCompanyLogo(byte[] companyLogo) {
		this.companyLogo = companyLogo;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getHighConnectPitch() {
		return highConnectPitch;
	}

	public void setHighConnectPitch(String highConnectPitch) {
		this.highConnectPitch = highConnectPitch;
	}
	
	
	

}
