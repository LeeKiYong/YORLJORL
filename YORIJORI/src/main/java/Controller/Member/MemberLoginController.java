package Controller.Member;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Command.Login.LoginCommand;
import Service.Member.MemberLoginService;
import Validator.LoginCommandValidator;

@Controller
@RequestMapping("/login")
public class MemberLoginController {
	
	@Autowired
	MemberLoginService memberLoginService;
	
	//GET방식
	//주소창에 주소를 직접 입력하는 GET방식 일때는 login 페이지 이동
	@RequestMapping(method=RequestMethod.GET)
	public String loginPro() {
		return "redirect:/loginForm";
	}
	
	//POST방식 >>> submit 했을 시
	@RequestMapping(method=RequestMethod.POST)
	public String login(LoginCommand loginCommand, Errors errors, HttpSession session, 
			HttpServletResponse response) {
		
		//1. 유효성검사 클래스(Validator) 호출
		new LoginCommandValidator().validate(loginCommand, errors);
		//조건문(hasErrors()) >>> 유효성 있을 시
		if(errors.hasErrors()) {
			return "main/login";
		}
		
		//LoginService 실행
		//실행 결과값을 i라는 Integer형 변수로 설정
		//결과값에 따라 sql문 실행유무 확인 후 에러메세지 호출.
		Integer i = memberLoginService.loginPro(loginCommand, session, response);
		if(i == 0) {
			//로그인 실행 시 입력한 아이디 비교 >>> 없을 시
			errors.rejectValue("id1", "notId");
			return "main/login";
		} else if(i == -1) {
			//로그인 실행 시 입력한 비밀번호 비교 >>> 불일치 시
			errors.rejectValue("pw", "wrong");
			return "main/login";
		}
		return "redirect:/main";
	}
	
}
