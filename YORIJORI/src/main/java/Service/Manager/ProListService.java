package Service.Manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Model.DTO.ProviderDTO;
import Repository.Manager.ProviderRepository;

@Service
public class ProListService {

	//DAO 의존객체 생성      >>> mybatis 사용시 (Repository)
	@Autowired
	private ProviderRepository providerRepository;
	
	public void list(Model model) {
		ProviderDTO providerDTO = new ProviderDTO();
		List<ProviderDTO> list = providerRepository.providerSelect();
		model.addAttribute("list", list);
	}

}
