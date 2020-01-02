package Model.DTO;

public class ChefSignUpDTO {
	private Integer memNum;
	private Integer managerNum;	// 매니저번호
	private String intro;
	private String license;
	private String career;
	public ChefSignUpDTO() {}
	
	public ChefSignUpDTO(String intro, String license, String career) {
		super();
		this.intro = intro;
		this.license = license;
		this.career = career;
	}
	
	public Integer getMemNum() {
		return memNum;
	}

	public void setMemNum(Integer memNum) {
		this.memNum = memNum;
	}

	public Integer getManagerNum() {
		return managerNum;
	}

	public void setManagerNum(Integer managerNum) {
		this.managerNum = managerNum;
	}

	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	public String getCareer() {
		return career;
	}
	public void setCareer(String career) {
		this.career = career;
	}
	
}
