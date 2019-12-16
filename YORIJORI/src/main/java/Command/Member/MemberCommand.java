package Command.Member;

public class MemberCommand {
	//	   dao
	//View ---> command ----> dto ------> db
	//				  service
	//request.getParameter()  >> 쿼리스트링문 command 클래스 이용하여 임시저장
	//view를 받아옴.
	String memId;
	String memPw;
	String memPwCon;
	String memName;
	String memBirth;
	String memPh;
	String memEmail;
	String memAddr;
	
	
	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public String getMemPw() {
		return memPw;
	}

	public void setMemPw(String memPw) {
		this.memPw = memPw;
	}

	public String getMemPwCon() {
		return memPwCon;
	}

	public void setMemPwCon(String memPwCon) {
		this.memPwCon = memPwCon;
	}

	public String getMemName() {
		return memName;
	}

	public void setMemName(String memName) {
		this.memName = memName;
	}

	public String getMemBirth() {
		return memBirth;
	}

	public void setMemBirth(String memBirth) {
		this.memBirth = memBirth;
	}

	public String getMemPh() {
		return memPh;
	}

	public void setMemPh(String memPh) {
		this.memPh = memPh;
	}

	public String getMemEmail() {
		return memEmail;
	}

	public void setMemEmail(String memEmail) {
		this.memEmail = memEmail;
	}

	public String getMemAddr() {
		return memAddr;
	}

	public void setMemAddr(String memAddr) {
		this.memAddr = memAddr;
	}

	//비밀번호와 비밀번호 확인 비교.
	public boolean isPasswordEqualToConfirmPassword() {
	if(memPwCon.equals(memPw)) {
		//비교 시 같으면 true 반환
		return true;
	}
		//다르면 false 반환
		return false;
	}
}
