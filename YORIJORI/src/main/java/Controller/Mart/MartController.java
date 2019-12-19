package Controller.Mart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MartController {
//쇼핑몰메인페이지이동
	@RequestMapping("/martMain")
	public String martMain() {
		System.out.println("마트메인컨트롤러");
		return "mart/martMain";
	}
}
