package Controller.Member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;

import Command.Member.MemberCommand;
import Service.Member.MemberJoinService;
import Validator.MemberCommandValidator;

@Controller
public class MemberJoinController {
	
	@Autowired
	MemberJoinService memberJoinService;
	
	//약관동의페이지 이동
	@RequestMapping("/agree")
	public String agree() {
		return "member/memberAgree";
	}
	
	//회원가입 페이지 이동
	@RequestMapping("/regist")
	public String memberForm(MemberCommand memberCommand) {
		return "member/memberForm";
	}
	
	//회원가입 action실행.
	@RequestMapping("/memberJoinAction")
	public String membetJoin(MemberCommand memberCommand, Errors errors) {
		//유효성 검사. (에러메세지 출력) >>> Validator 사용
		new MemberCommandValidator().validate(memberCommand, errors);
		if(errors.hasErrors()) {
			//에러가 있을 시?. >>> form페이지 그대로 
			return "member/memberForm";
		}
		
		//Service 실행.
		Integer result = memberJoinService.join(memberCommand);
		if(result == null) {
			//아이디 중복 유효성 메세지
			errors.rejectValue("memId", "duplicate");
			return "member/memberForm";
		}
		return "member/memberWelcome";
	}

}
