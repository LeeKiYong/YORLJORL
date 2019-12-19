package Controller.Manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;

import Command.manager.ProRegistCommand;
import Service.Manager.ProRegistService;

@Controller
public class ProviderController {
	
	@Autowired
	ProRegistService proRegistService;
	
	//공급자 등록 페이지 이동
	@RequestMapping("/providerRegistration")
	public String providerRegistration(ProRegistCommand proRegistCommand) {
		return "manager/providerRegistration";
	}
	//공급자 등록 action(Service)이동
	@RequestMapping("/providerRegistration/action")
	public String providerRegistrationAction(ProRegistCommand proRegistCommand,Errors errors) {
		//Service 실행.
		Integer result = proRegistService.regist(proRegistCommand);
		return "manager/providerList";
	}
	
}
