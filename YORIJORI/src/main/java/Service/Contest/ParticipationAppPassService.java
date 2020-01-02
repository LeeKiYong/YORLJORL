package Service.Contest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Model.DTO.ParticipationDTO;
import Repository.Participation.ParticipationRepository;

@Service
public class ParticipationAppPassService {

	@Autowired
	ParticipationRepository participationRepository;
	
	public void pass(String[] participationNum, Model model) {
		//배열로 받아온 것 list에 저장 후 map으로 보냄. (순서)
		//Mybatis에서 Map으로 전달 하기 위해.
		List<Long> cs = new ArrayList<Long>();
		for(String num : participationNum) {
			cs.add(Long.valueOf(num));
		}
		
		//map으로 전달하기 위해선 key가 필요함 
		// >> 현재 map에서 사용할 key의 타입은 Long
		//value는 뭐가 오든 상관하지 않기 위해 Object로 줌?
		//HashMap으로 객체생성?
		Map<String, Object> parNum = new HashMap<String, Object>();
		parNum.put("upParNum", cs);
		Integer result = 
				participationRepository.appUpdate(parNum);
		
		
		List<ParticipationDTO> upDto = participationRepository.selectUpdateAll();
		if(upDto != null) {
			System.out.println("작동하냐아ㅏㅏㅏㅏㅏㅏㅏㅏㅏ?");
			model.addAttribute("UpParticipation", upDto);
		}
		
	}

	
	
}
