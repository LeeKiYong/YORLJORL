package Controller.Mart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import Command.manager.ManagerLoginCommand;
import Command.manager.ProRegistCommand;

@Controller
public class MartController {
//쇼핑몰메인페이지이동
	@RequestMapping("/martMain")
	public String martMain(ManagerLoginCommand managerLoginCommand, ProRegistCommand proRegistCommand) {
		System.out.println("마트메인컨트롤러");
		return "mart/martMain";
	}
}
