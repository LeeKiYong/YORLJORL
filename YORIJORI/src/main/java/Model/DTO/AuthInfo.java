package Model.DTO;

//로그인 정보 저장
public class AuthInfo {
	
	private Long num;
	private String id;
	private String email;
	private String name;
	private String pw;
	
	//기본 생성자
	public AuthInfo() {
		
	}
	
	//setter 대신 >>> 생성자.
	public AuthInfo(Long num, String id, String email, String name, String pw) {
		this.num = num;
		this.id = id;
		this.email = email;
		this.name = name;
		this.pw = pw;
	}
	
	public void setNum(Long num) {
		this.num = num;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public Long getNum() {
		return num;
	}
	
	public String getId() {
		return id;
	}
	public String getEmail() {
		return email;
	}
	public String getName() {
		return name;
	}
	public String getPw() {
		return pw;
	}
	
	
}
