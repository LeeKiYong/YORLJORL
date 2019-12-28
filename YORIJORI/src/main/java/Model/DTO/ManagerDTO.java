package Model.DTO;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ManagerDTO implements Serializable {
	Integer managerNum;	// 매니저번호
	String managerName;	// 매니저이름
	String managerId;	// 매니저아이디
	String managerPassword;	// 매니저비밀번호
	String managerSecondPassword;	// 매니저 2차비밀번호
	
	public Integer getManagerNum() {
		return managerNum;
	}
	public void setManagerNum(Integer managerNum) {
		this.managerNum = managerNum;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	public String getManagerPassword() {
		return managerPassword;
	}
	public void setManagerPassword(String managerPassword) {
		this.managerPassword = managerPassword;
	}
	public String getManagerSecondPassword() {
		return managerSecondPassword;
	}
	public void setManagerSecondPassword(String managerSecondPassword) {
		this.managerSecondPassword = managerSecondPassword;
	}
}
