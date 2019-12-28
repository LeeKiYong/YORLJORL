package Service.Main;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Command.Login.LoginCommand;
import Model.DTO.AuthInfo;
import Model.DTO.MemberDTO;
import Repository.Member.MemberRepository;

@Service
public class MainService {

	@Autowired
	private MemberRepository memberRepository;
	
	//자동로그인 클릭 할 시 >>> 자동으로 로그인이 됨 >>> 로그인이 되는 service생성
	//로그인 할 시 데이터 비교 후 세션값 넣음.
	public void autoLogin(LoginCommand loginCommand, HttpSession session) {
		MemberDTO dto = new MemberDTO();
		dto.setMemId(loginCommand.getId1());
		dto = memberRepository.userCheck(dto);
		
		//세션변수 선언 후 세션생성
		AuthInfo authInfo = new AuthInfo(dto.getMemNum(), dto.getMemId(), dto.getMemEmail(), dto.getMemName(), dto.getMemPw());
		session.setAttribute("authInfo", authInfo);
	}
}
