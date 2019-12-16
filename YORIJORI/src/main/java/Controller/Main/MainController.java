package Controller.Main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

	//메인페이지 이동
	@RequestMapping("/main")
	public String form() {
		return "main/main";
	}
	
	//로그인페이지 이동
	@RequestMapping("/loginForm")
	public String loginForm() {
		return "main/login";
	}
}
