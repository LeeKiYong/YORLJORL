package Model.DTO;

public class ManagerAutoInfo {
	// 로그인 세션저장용 DTO
	private String manIdA;	// 관리자아이디	
	private String manPwA;	// 관리자 비밀번호
	private String manSePwA;	// 관리자2차비밀번호
	private String manNameA;	// 관리자이름
	
	public ManagerAutoInfo() {
		
	}
	
	public ManagerAutoInfo(String manIdA, String manPwA, String manSePwA, String manNameA) {
		super();
		this.manIdA = manIdA;
		this.manPwA = manPwA;
		this.manSePwA = manSePwA;
		this.manNameA = manNameA;
	}
	public void setManIdA(String manIdA) {
		this.manIdA = manIdA;
	}
	public void setManPwA(String manPwA) {
		this.manPwA = manPwA;
	}
	public void setManSePwA(String manSePwA) {
		this.manSePwA = manSePwA;
	}
	public void setManNameA(String manNameA) {
		this.manNameA = manNameA;
	}
	public String getManIdA() {
		return manIdA;
	}
	public String getManPwA() {
		return manPwA;
	}
	public String getManSePwA() {
		return manSePwA;
	}
	public String getManNameA() {
		return manNameA;
	}
	
	
}
