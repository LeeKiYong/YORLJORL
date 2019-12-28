package Service.Contest;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Command.Contest.ContestCommand;
import Model.DTO.ContestDTO;
import Repository.Contest.ContestRepository;

@Service
public class ContestCreateService {

	@Autowired
	ContestRepository contestRepository;
	
	public Integer create(ContestCommand contestCommand) {
		
		ContestDTO dto = new ContestDTO();
		dto.setContestName(contestCommand.getContestName());
		
		//시작날짜 / 종료날짜 패턴 설정
		SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		
		//replace(문자변환) >>  "T" 를 " "(공백)으로
		//String을 Date로 parse(변환)시킨 후 DB저장위해 TimeStamp로 변환
		try {
			Date date = dt.parse(contestCommand.getContestStart().replace("T", " "));
			Timestamp contestStart = new Timestamp(date.getTime());
			dto.setContestStart(contestStart);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//replace(문자변환) >>  "T" 를 " "(공백)으로
		//String을 Date로 parse(변환)시킨 후 DB저장위해 TimeStamp로 변환
		try {
			Date date1 = dt.parse(contestCommand.getContestEnd().replace("T", " "));
			Timestamp contestEnd = new Timestamp(date1.getTime());
			dto.setContestEnd(contestEnd);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Integer result = contestRepository.insertContest(dto);
		return result;
	}
}
