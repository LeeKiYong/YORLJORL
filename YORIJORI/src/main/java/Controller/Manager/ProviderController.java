package Controller.Manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import Command.manager.ProRegistCommand;
import Service.Manager.ProDetailService;
import Service.Manager.ProListService;
import Service.Manager.ProRegistService;

@Controller
public class ProviderController {
	
	@Autowired
	ProRegistService proRegistService;
	
	@Autowired
	ProDetailService proDetailService;
	
	@Autowired
	ProListService proListService;
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
	//공급자 목록 페이지 이동
	@RequestMapping("/providerList")
	public String providerList(Model model) {
		//Service 실행.
		proListService.list(model);
		return "manager/providerList";
	}
	//공급자 자세히보기
	@RequestMapping("/providerDetail/{providerNum}")
	public String providerDetail(@PathVariable("providerNum") Long providerNum , Model model) {
		System.out.println("providerNum  ::  " + providerNum);
		proDetailService.detail(providerNum,model);
		return "manager/providerDetail";
	}
	//공급자 수정하기
	//@RequestMapping("/providerModification")
	//public String providerModification(ProRegistCommand proRegistCommand) {
	//	return 
	//}
}
