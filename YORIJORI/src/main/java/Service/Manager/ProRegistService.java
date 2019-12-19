package Service.Manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Command.manager.ProRegistCommand;
import Model.DTO.ProviderDTO;
import Repository.Manager.ProviderRepository;

@Service
public class ProRegistService {
	
	//DAO 의존객체 생성      >>> mybatis 사용시 (Repository)
	@Autowired
	private ProviderRepository providerRepository;

	public Integer regist(ProRegistCommand proRegistCommand) {
		
		ProviderDTO providerDTO = new ProviderDTO();
		providerDTO.setProviderNum(proRegistCommand.getProviderNum());
		providerDTO.setProviderName(proRegistCommand.getProviderName());
		providerDTO.setProviderPh(proRegistCommand.getProviderPh());
		providerDTO.setProviderEmail(proRegistCommand.getProviderEmail());
		providerDTO.setProviderAccount(proRegistCommand.getProviderAccount());
		providerDTO.setAccountsPayable(proRegistCommand.getAccountsPayable());
		
		Integer result = providerRepository.providerInsert(providerDTO);
		return result;
	}

}
