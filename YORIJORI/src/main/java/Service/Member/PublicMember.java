package Service.Member;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import Command.Member.MemberCommand;
import Encrypt.Encrypt;
import Model.DTO.MemberDTO;

public class PublicMember {

	//static >>> 객체를 계속 생성안시켜도 됨.
	//DTO 생성
	//코드 간소화를 위해 >>>> DB에 데이터 입력 할 시
	public static MemberDTO execute(MemberCommand memberCommand) {
		MemberDTO dto = new MemberDTO();
		
		dto.setMemId(memberCommand.getMemId());
		dto.setMemName(memberCommand.getMemName());
		dto.setMemPh(memberCommand.getMemPh());
		dto.setMemEmail(memberCommand.getMemEmail());
		dto.setMemAddr(memberCommand.getMemAddr());
		
		
		//비밀번호 암호화.
		dto.setMemPw(Encrypt.getEncryption(memberCommand.getMemPw()));
		
		//생년월일 패턴 설정
		//SimpleDateFormat 패턴과  validator 패턴이 같아야함.
		SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			Date date = dt.parse(memberCommand.getMemBirth());
			//date를 getTime하여 Timestamp에 넣음
			Timestamp memBirth = new Timestamp(date.getTime());
			dto.setMemBirth(memBirth);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return dto;
	}
}
