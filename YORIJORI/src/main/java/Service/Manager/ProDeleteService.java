package Service.Manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Model.DTO.ProviderDTO;
import Repository.Manager.ProviderRepository;

@Service
public class ProDeleteService {
	
	//DAO 의존객체 생성      >>> mybatis 사용시 (Repository)
	@Autowired
	private ProviderRepository providerRepository;
	
	public void delete(Long providerNum) {
		ProviderDTO providerDTO = new ProviderDTO();
		providerDTO.setProviderNum(providerNum);
		System.out.println(providerDTO.getProviderNum());
		Integer result = providerRepository.providerDelete(providerDTO);
	}
}
