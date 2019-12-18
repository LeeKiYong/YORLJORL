package Controller.Main;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Command.Login.LoginCommand;
import Service.Main.MainService;

@Controller
public class MainController {
	
	@Autowired
	MainService mainService;

	//메인페이지 이동
	@RequestMapping("/main")
	public String form() {
		return "main/main";
	}
	
	//로그인페이지 이동
	//GET형식으로 입력 받을 시.
	//@CookieValue(value="idStore", required = false) Boolean idStore
	// >> 쿠키의 값 넣기 >> 있으면 체크가 되어있고 없으면 false(체크해제)
	@RequestMapping(method=RequestMethod.GET, value="/loginForm")
	public String loginForm(LoginCommand loginCommand, 
			@CookieValue(value="idStore", required=false) Cookie idStore, 
			@CookieValue(value="autoLogin", required=false) Cookie autoLogin, HttpSession session) {
		
		//아이디기억하기 쿠키의 값이 null이 아닐 때 (값이 있을 때)
		if(idStore != null) {
			//체크박스 true / id에 쿠기값으로 저장된 value(id)저장
			loginCommand.setIdStore(true);
			loginCommand.setId1(idStore.getValue());
		}
		
		//자동로그인 쿠기값이 null이 아닐 때 (값이 있을 때)
		if(autoLogin != null) {
			//id에 쿠키값으로 저장된 value 저장
			loginCommand.setId1(autoLogin.getValue());
			//자동로그인 Service 실행 
			mainService.autoLogin(loginCommand, session);
		}
		
		return "main/login";
	}
}
