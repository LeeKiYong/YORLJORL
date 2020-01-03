package Command.manager;

public class ContractCommand {

	private Long providerNum;
	private String contractDate;
	private String contractExirationDate;
	private String ingredientName;
	private Integer contractPrice;
	private String ingredientRegion;
	
	public Long getProviderNum() {
		return providerNum;
	}
	public void setProviderNum(Long providerNum) {
		this.providerNum = providerNum;
	}
	public String getContractDate() {
		return contractDate;
	}
	public void setContractDate(String contractDate) {
		this.contractDate = contractDate;
	}
	public String getContractExirationDate() {
		return contractExirationDate;
	}
	public void setContractExirationDate(String contractExirationDate) {
		this.contractExirationDate = contractExirationDate;
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
