package Controller.Chef;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Command.Chef.ChefSignUpCommand;
import Command.manager.ManagerLoginCommand;
import Service.Chef.ChefSignUpProService;

@Controller
public class ChefController {
	
	@Autowired
	ChefSignUpProService chefSignUpProService;
	@Autowired
//	ChefSignUpListService chefSignUpListService;
	// 셰프신청 페이지로 이동
	@RequestMapping("/chefSignUp")
	public String chefSignUp(ManagerLoginCommand managerLoginCommand, ChefSignUpCommand chefSignUpCommand) {
		System.out.println("셰프신청 컨트롤러");
		return "chef/chefSignUp";
	}
	// 셰프신청Pro
	@RequestMapping(value = "/chefSignUpPro", method = RequestMethod.POST)
	public String chefSignUpPro(@RequestParam(value = "num", required=false) Integer num, ManagerLoginCommand managerLoginCommand, ChefSignUpCommand chefSignUpCommand) {
		System.out.println("셰프신청완료 컨트롤러");
		System.out.println(chefSignUpCommand.getCareer());
		System.out.println(chefSignUpCommand.getIntro());
		System.out.println(chefSignUpCommand.getLicense());
		System.out.println(num);
		Integer result = chefSignUpProService.regist(num, chefSignUpCommand);
		System.out.println(result);
		if(result == 1) {
			// ㅜㅜ
			return "main/main";
		}
		return "main/main";
	}
	// 셰프신청 리스트
	@RequestMapping(value = "chefSignUpList", method = RequestMethod.POST)
	public String chefSignUpList(ManagerLoginCommand managerLoginCommand) {
//		chefSignUpListService.regist();
		return "chef/chefList";
	}
		
}