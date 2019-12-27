package Controller.Manager;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Command.manager.ManagerLoginCommand;
import Service.Manager.ManagerLoginService;
import Validator.ManagerLoginCommandValidator;

@Controller
@RequestMapping("/managerLogin")
public class managerLoginController {
	
	@Autowired
	ManagerLoginService managerLoginService;
	
	// 주소창에 값입력으로 접근시 메인으로 보내버렷!
	@RequestMapping(method=RequestMethod.GET)
	public String managerLoginGet() {
		return "redirect:/main";
	}
	
	// POST방식으로 접근
	@RequestMapping(method = RequestMethod.POST)
	public String managerLogin(ManagerLoginCommand managerLoginCommand, Errors errors, HttpSession session, 
			HttpServletRequest request, HttpServletResponse response) {
		// 관리자로그인 유효성검사
		new ManagerLoginCommandValidator().validate(managerLoginCommand, errors);
		if(errors.hasErrors()) {
			return "main/login";
		}
		// 로그인실패시이동할페이지 생성
		Integer i = managerLoginService.managerLoginPro(managerLoginCommand, session, response);
		if(i == 0) {
			errors.rejectValue("mid", "notmId");
			// 아이디가 없을시
			System.out.println("아이디가없습니다");
			return "main/login";
		} else if(i == -1) {
			errors.rejectValue("mpw", "wrongM");
			System.out.println("비밀번호가 틀립니다.");
			return "main/login";
		}
		String uri = request.getHeader("referer");
		System.out.println("자르기전" + uri);
		String uri2 = uri.substring(uri.lastIndexOf("/")+1);
		System.out.println("자른후" + uri2);
		return "redirect:/" + uri2;
	}
}
