package Service.Member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Command.Member.MemberCommand;
import Model.DTO.MemberDTO;
import Repository.Member.MemberRepository;

@Service
public class MemberJoinService {
	
	@Autowired
	private MemberRepository memberRepository;
	
	public Integer join(MemberCommand memberCommand) {
		
		//DTO 생성
		//PublicMember에 선언한 execute 메소드 호출
		//execute 메소드는 insert시 DB에 들어가야 할 데이터들을  command에서 DTO로 이동시키게 한 것
		MemberDTO dto = PublicMember.execute(memberCommand);
		
		Integer result = memberRepository.insertMember(dto);
		return result;
	}

}
