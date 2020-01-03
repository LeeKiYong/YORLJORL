package Service.Manager;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import Command.manager.ProRegistCommand;
import Model.DTO.ProviderDTO;
import Repository.Manager.ProviderRepository;

public class ProModifyService {
	@Autowired
	ProviderRepository providerRepository;
	
	public void modify(Long providerNum, Model model) {
		System.out.println("수정하기페이지");
		ProRegistCommand proRegistCommand = new ProRegistCommand();
		proRegistCommand.setProviderNum(providerNum);
		
		ProviderDTO providerDTO = new ProviderDTO();
		providerDTO.setProviderNum(proRegistCommand.getProviderNum());
		providerDTO = providerRepository.providerSelectOne(providerDTO);
		
		model.addAttribute("provider", providerDTO);
	}
	
	public void modifyPro(Long providerNum, ProRegistCommand proRegistCommand, Model model) {
		System.out.println("modifyPro");
		proRegistCommand.setProviderNum(providerNum);
		ProviderDTO providerDTO = new ProviderDTO();
		providerDTO.setProviderNum(providerNum);
		providerDTO.setProviderName(proRegistCommand.getProviderName());
		providerDTO.setProviderPh(proRegistCommand.getProviderPh());
		providerDTO.setProviderEmail(proRegistCommand.getProviderEmail());
		providerDTO.setAccountsPayable(proRegistCommand.getAccountsPayable());
		providerDTO.setProviderAccount(proRegistCommand.getProviderAccount());
		
		providerRepository.modifyProUpdate(providerDTO);
		model.addAttribute("provider", providerDTO);
	}

}
