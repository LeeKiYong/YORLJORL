package Controller.Manager;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProviderController {
	
	//공급자 등록 페이지 이동
	@RequestMapping("/providerRegistration")
	public String providerRegistration() {
		System.out.println("공급자 등록 페이지 컨트ㅗㄹ러");
		return "manager/providerRegistration";
	}
}
