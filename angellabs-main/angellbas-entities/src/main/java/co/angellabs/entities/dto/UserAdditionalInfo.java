package co.angellabs.entities.dto;

public class UserAdditionalInfo {
	
	
	private long useradditionalInfoId;
	
	private String miniresume;
	
	private String summary;
	
	private String achievment;
	
	private String lookingfor;
	
	private byte[] photo;
	
	private int userId;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public long getUseradditionalInfoId() {
		return useradditionalInfoId;
	}

	public void setUseradditionalInfoId(long useradditionalInfoId) {
		this.useradditionalInfoId = useradditionalInfoId;
	}

	public String getMiniresume() {
		return miniresume;
	}

	public void setMiniresume(String miniresume) {
		this.miniresume = miniresume;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getAchievment() {
		return achievment;
	}

	public void setAchievment(String achievment) {
		this.achievment = achievment;
	}

	public String getLookingfor() {
		return lookingfor;
	}

	public void setLookingfor(String lookingfor) {
		this.lookingfor = lookingfor;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

}
