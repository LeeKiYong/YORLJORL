package Controller.Chef;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Command.Chef.ChefSignUpCommand;
import Command.manager.ManagerLoginCommand;
import Service.Chef.ChefSignUpProService;

@Controller
public class ChefController {
	
	//@Autowired
	ChefSignUpProService chefSignUpProService;
	
	// 쉐프신청 페이지로 이동
	@RequestMapping("/chefSignUp")
	public String chefSignUp(ManagerLoginCommand managerLoginCommand, ChefSignUpCommand chefSignUpCommand) {
		System.out.println("셰프신청 컨트롤러");
		return "chef/chefSignUp";
	}
	@RequestMapping("/chefSignUpPro")
	public String chefSignUpPro(@RequestParam(value = "num", required=false) Integer num, ManagerLoginCommand managerLoginCommand, ChefSignUpCommand chefSignUpCommand) {
		System.out.println("셰프신청완료 컨트롤러");
		chefSignUpProService.regist(num, chefSignUpCommand);
		return "";
	}
}
