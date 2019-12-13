package Controller.Member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberJoinController {
	
	//약관동의페이지 이동
	@RequestMapping("/register/agree")
	public String agree() {
		return "member/memberAgree";
	}

}
