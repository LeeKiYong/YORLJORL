package Command.manager;

//공급자등록 커맨드
public class ProRegistCommand {
	private Long providerNum;//사업자 번호
	private String providerName;//공급자 이름
	private String providerPh;//공급자 연락처
	private String providerEmail;//공급자 이메일주소
	private Long providerAccount;//공급자 계좌번호
	private Long accountsPayable;//외상매입금
	
	public Long getProviderNum() {
		return providerNum;
	}
	public void setProviderNum(Long providerNum) {
		this.providerNum = providerNum;
	}
	public String getProviderName() {
		return providerName;
	}
	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}
	public String getProviderPh() {
		return providerPh;
	}
	public void setProviderPh(String providerPh) {
		this.providerPh = providerPh;
	}
	public String getProviderEmail() {
		return providerEmail;
	}
	public void setProviderEmail(String providerEmail) {
		this.providerEmail = providerEmail;
	}
	public Long getProviderAccount() {
		return providerAccount;
	}
	public void setProviderAccount(Long providerAccount) {
		this.providerAccount = providerAccount;
	}
	public Long getAccountsPayable() {
		return accountsPayable;
	}
	public void setAccountsPayable(Long accountsPayable) {
		this.accountsPayable = accountsPayable;
	}
	
	 
	
}
