package Service.Manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Command.manager.ProRegistCommand;
import Model.DTO.ProviderDTO;
import Repository.Manager.ProviderRepository;

@Service
public class ProDetailService {

	@Autowired
	ProviderRepository providerRepository;
	
	public void detail(Long providerNum, Model model) {
		ProRegistCommand proRegistCommand = new ProRegistCommand();
		proRegistCommand.setProviderNum(providerNum);
		
		ProviderDTO providerDTO = new ProviderDTO();
		providerDTO.setProviderNum(proRegistCommand.getProviderNum());
		providerDTO = providerRepository.providerSelectOne(providerDTO);
		
		model.addAttribute("provider", providerDTO);
		
	}

}
