package Model.DTO;

import java.io.Serializable;
import java.sql.Timestamp;

//직렬화 ??  >> DB와 DTO를 연결 시켜줘야 함  >>SerializableException 이 나올 시
@SuppressWarnings("serial")
public class ContractDTO implements Serializable {

	Integer contractNum;
	Long providerNum;
	Timestamp contractDate;
	Timestamp contractExpirationDate;
	String ingredientName;
	Integer contractPrice;
	String ingredientRegion;
	
	public Integer getContractNum() {
		return contractNum;
	}
	public void setContractNum(Integer contractNum) {
		this.contractNum = contractNum;
	}
	public Long getProviderNum() {
		return providerNum;
	}
	public void setProviderNum(Long providerNum) {
		this.providerNum = providerNum;
	}
	public Timestamp getContractDate() {
		return contractDate;
	}
	public void setContractDate(Timestamp contractDate) {
		this.contractDate = contractDate;
	}
	public Timestamp getContractExpirationDate() {
		return contractExpirationDate;
	}
	public void setContractExpirationDate(Timestamp contractExpirationDate) {
		this.contractExpirationDate = contractExpirationDate;
	}
	public String getIngredientName() {
		return ingredientName;
	}
	public void setIngredientName(String ingredientName) {
		this.ingredientName = ingredientName;
	}
	public Integer getContractPrice() {
		return contractPrice;
	}
	public void setContractPrice(Integer contractPrice) {
		this.contractPrice = contractPrice;
	}
	public String getIngredientRegion() {
		return ingredientRegion;
	}
	public void setIngredientRegion(String ingredientRegion) {
		this.ingredientRegion = ingredientRegion;
	}
	
	
}
