package Controller.Manager;

import java.net.http.HttpResponse;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import Command.manager.ManagerLoginCommand;
import Command.manager.ProRegistCommand;
import Service.Manager.ProDetailService;
import Service.Manager.ProListService;
import Service.Manager.ProModifyService;
import Service.Manager.ProRegistService;

@Controller
public class ProviderController {
	
	@Autowired
	ProRegistService proRegistService;
	
	@Autowired
	ProDetailService proDetailService;
	
	@Autowired
	ProListService proListService;
	
	@Autowired
	ProModifyService proModifyService;
	
//	@Autowired
//	ProModifyService proModifyService;
	//공급자 등록 페이지 이동
	@RequestMapping("/providerRegistration")
	public String providerRegistration(ProRegistCommand proRegistCommand, ManagerLoginCommand managerLoginCommand,HttpSession session) {
		return "manager/providerRegistration";
	}
	//공급자 등록 action(Service)이동
	@RequestMapping("/providerRegistration/action")
	public String providerRegistrationAction(ProRegistCommand proRegistCommand,Errors errors,HttpSession session) {
		//Service 실행.
		Integer result = proRegistService.regist(proRegistCommand);
		return "manager/providerList";
	}
	//공급자 목록 페이지 이동
	@RequestMapping("/providerList")
	public String providerList(Model model, ManagerLoginCommand managerLoginCommand,HttpSession session) {
		//Service 실행.
		proListService.list(model);
		return "manager/providerList";
	}
	//공급자 자세히보기
	@RequestMapping("/providerDetail/{providerNum}")
	public String providerDetail(@PathVariable("providerNum") Long providerNum , Model model, ManagerLoginCommand managerLoginCommand, HttpSession session) {
		System.out.println("providerNum  ::  " + providerNum);
		proDetailService.detail(providerNum,model);
		return "manager/providerDetail";
	}
	//공급자 수정하기
	@RequestMapping("/providerModification/{providerNum}")
	public String providerModification(@PathVariable("providerNum") Long providerNum, Model model, ManagerLoginCommand managerLoginCommand, HttpSession session) {
		System.out.println("수정서비스12");
		proModifyService.modify(providerNum, model);
		return "manager/providerModification";
	}
	//공급자 삭제하기
	//@RequestMapping("/providerDelete")
}
