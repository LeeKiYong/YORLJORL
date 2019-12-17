package Service.Member;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Command.Login.LoginCommand;
import Model.DTO.MemberDTO;
import Repository.Member.MemberRepository;

@Service
public class MemberLoginService {
	
	@Autowired
	MemberRepository memberRepository;
	
	public Integer loginPro(LoginCommand loginCommand, HttpSession session, HttpServletResponse response) {
		//리턴값 선언
		Integer result = 0;
		
		//MemberDTO에 command에 저장된 id값 저장.
		//call by reference >>> 값을 반환하지 않고 Repository에서 변수에 바로 저장
		//전달된 인자에다 값을 그대로 적용 >>> 객체에만 사용가능 (리터럴에는 사용 불가?)
		//ex) dto = memberRepository.userCheck(dto)  >> call by Value
		MemberDTO dto = new MemberDTO();
		dto.setMemId(loginCommand.getId1());
		dto = memberRepository.userCheck(dto);
		return result;
	}

}
