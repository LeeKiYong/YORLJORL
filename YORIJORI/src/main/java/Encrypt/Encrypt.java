package Encrypt;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encrypt {
	//비밀번호 암호화 알고리즘
	//암호화 시키면 DB varchar2크기 늘려야함 >> 최소 varchar2(100)
	static MessageDigest md;
	static StringBuffer sb;
	public static String getEncryption(String memPw) {
		try {
			//암호화 방식. (SHA-256) >> 바꾸려면 SHA-256을 바꾸고 싶은 암호화 방식으로 바꾸면 됨.
			md = MessageDigest.getInstance("SHA-256"); 
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//데이터크기 byte로 변경
		//바이트 방식 >> 숫자형식
		md.update(memPw.getBytes());
		//숫자형식의 바이트를 스트링으로 변환 
		byte[] byteData = md.digest();
		sb =new StringBuffer();
		for (int i = 0; i < byteData.length; i++) {
			//(byteData[i]&0xff) + 0x100, 16  >> 16진수(0x)인 것을 toString으로 바꿔서 StringBuffer에 추가.
			//추가후 substring(1) >> 한 글자 씩 append.
			sb.append(Integer.toString((byteData[i]&0xff) + 0x100, 16).substring(1));
		}
		//sb값을 toString으로 String형으로 바꿔 반환.
		return sb.toString();
	}
}
