package Service.Contest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Command.Contest.ParticipationCommand;
import Model.DTO.ParticipationDTO;
import Repository.Participation.ParticipationRepository;

@Service
public class ParticipationInsertService {

	@Autowired
	ParticipationRepository participationRepository;
	
	String original = null;
	String originalFileExtension = null;
	String store = null;
	String fileSize = null;
	
	public void insert(ParticipationCommand participationCommand, HttpSession session, HttpServletRequest request) {
		
		//DTO
		ParticipationDTO dto = new ParticipationDTO();
		
		//command 데이터 DTO에 저장
		//session 값 중 아이디값 가져오기 (authInfo)
		
		
	}

}
