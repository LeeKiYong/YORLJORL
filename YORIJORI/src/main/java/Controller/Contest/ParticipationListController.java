package Controller.Contest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Service.Contest.ParticipationAppPassService;
import Service.Contest.ParticipationListService;

@Controller
public class ParticipationListController {

	@Autowired
	ParticipationListService participationListService;
	
	@Autowired
	ParticipationAppPassService participationAppPassService;
	
	@RequestMapping("/participationList")
	public String list(Model model) {
		participationListService.participationList(model);
		return "contest/participationList";
	}
	
	@RequestMapping(value="/parPass", method=RequestMethod.POST)
	public String listAction(@RequestParam(value="check") String[] participationNum, 
			Model model) {
		participationAppPassService.pass(participationNum, model);
		return "redirect:/participationList";
	}
}
