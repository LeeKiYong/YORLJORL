package Service.Member;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

@Service
public class MemberLogoutService {
	
	public void logout(HttpSession session, HttpServletResponse response) {
		
		//자동로그인 쿠키 제거 (생성 후 제거??)
		Cookie autoLoginCookie = new Cookie("autoLogin", "");
		autoLoginCookie.setMaxAge(0);
		response.addCookie(autoLoginCookie);
		
		//세션 제거 (authInfo 세션 제거)
		session.invalidate();
	}

}
