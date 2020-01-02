package Service.Contest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Model.DTO.ParticipationDTO;
import Repository.Participation.ParticipationRepository;

@Service
public class ParticipationListService {

	@Autowired
	ParticipationRepository participationRepository;
	
	public void participationList(Model model) {
		List<ParticipationDTO> dto = participationRepository.selectAll();
		if(dto != null) {
			model.addAttribute("participation", dto);
		}
	}

}
