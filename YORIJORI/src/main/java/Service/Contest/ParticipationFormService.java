package Service.Contest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Repository.Contest.ContestRepository;

@Service
public class ParticipationFormService {
	
	@Autowired
	ContestRepository contestRepository;
	
	public void contestNumSelect(Model model) {
		
		List<Long> list = contestRepository.selectContestNum();
		model.addAttribute("contestNum", list);
	}
}
