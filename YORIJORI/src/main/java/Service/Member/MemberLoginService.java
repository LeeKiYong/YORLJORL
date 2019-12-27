package Service.Member;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Command.Login.LoginCommand;
import Encrypt.Encrypt;
import Model.DTO.AuthInfo;
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
		
		//로그인 세션 선언.
		AuthInfo authInfo = null;
		
		//아이디와 비밀번호 존재하는지 확인. (조건문)
		if(dto == null) {
			//아이디가 없을 때
			result = 0;
		} else {
			//아이디가 있을 때 >>>> 비밀번호 맞는지 비교
			//select 후 dto로 저장된 비밀번호 데이터를 입력한(command에 저장된) pw와 비교
			//command의 비밀번호는 암호화를 실행 해줘야 함
			if(Encrypt.getEncryption(loginCommand.getPw()).equals(dto.getMemPw())) {
				//입력한 command의 비밀번호와 불러온 dto의 비밀번호가 같을 때
				//로그인 세션값 저장
				authInfo = 
						new AuthInfo(dto.getMemNum(), dto.getMemId(), dto.getMemEmail(), dto.getMemName(), dto.getMemPw());
				//세션 attribute
				session.setAttribute("authInfo", authInfo);
				//쿠키저장.
				setCookie(loginCommand, response);
				result = 1;
			} else {
				//입력한 command의 비밀번호와 불러온 dto의 비밀번호가 다를 때
				result = -1;
			}
		}
		
		return result;
	}
	
	//쿠키생성
	public void setCookie(LoginCommand loginCommand, HttpServletResponse response) {
		
		//아이디 기억하기 쿠키 생성
		Cookie idStoreCookie = new Cookie("idStore", loginCommand.getId1());
		//아이디 기억하기 체크박스 클릭유무 조건문
		if(loginCommand.getIdStore()) {
			//아이디 기억하기 체크박스 클릭 시 (자동으로 command의 변수 값이 true)
			idStoreCookie.setMaxAge(60*60*24*30);
		} else {
			//아이디 기억하기 체크박스 클릭 안할 시 (false)
			idStoreCookie.setMaxAge(0);
		}
		
		//자동로그인 쿠키 생성s
		Cookie autoLoginCookie = new Cookie("autoLogin", loginCommand.getId1());
		//자동로그인 체크박스 클릭유무 조건문
		if(loginCommand.getAutoLogin()) {
			//자동로그인 체크박스 클릭 시 (자동으로 command의 변수 값이 true)
			autoLoginCookie.setMaxAge(60*60*24*30);
		}
		
		//쿠키 전달(저장) response >>> 자신의 컴퓨터에
		response.addCookie(idStoreCookie);
		response.addCookie(autoLoginCookie);
	}

}
