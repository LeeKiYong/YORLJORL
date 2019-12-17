package Model.DTO;

import java.io.Serializable;
import java.sql.Timestamp;

//직렬화 ??  >> DB와 DTO를 연결 시켜줘야 함  >>SerializableException 이 나올 시
@SuppressWarnings("serial")
public class MemberDTO implements Serializable {
	Long memNum;
	String memId;
	String memPw;
	String memName;
	Timestamp memBirth;
	String memPh;
	String memEmail;
	String memAddr;
	String memYorn;
	
	public Long getMemNum() {
		return memNum;
	}
	public void setMemNum(Long memNum) {
		this.memNum = memNum;
	}
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
	public String getMemName() {
		return memName;
	}
	public void setMemName(String memName) {
		this.memName = memName;
	}
	public Timestamp getMemBirth() {
		return memBirth;
	}
	public void setMemBirth(Timestamp memBirth) {
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
	public String getMemYorn() {
		return memYorn;
	}
	public void setMemYorn(String memYorn) {
		this.memYorn = memYorn;
	}
}
