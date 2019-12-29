package Controller.Contest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import Command.Contest.ParticipationCommand;
import Service.Contest.ParticipationFormService;
import Service.Contest.ParticipationInsertService;

@Controller
public class ParticipationController {
	
	@Autowired
	ParticipationInsertService participationInsertService;
	
	@Autowired
	ParticipationFormService participationFormService;

	@RequestMapping("contest/participation")
	public String form(ParticipationCommand participationCommand, Model model) {
		participationFormService.contestNumSelect(model);
		return "contest/participationForm";
	}
	
	@RequestMapping("contest/participationInsert")
	public String participationInsert(ParticipationCommand participationCommand, HttpSession session, HttpServletRequest request) {
		participationInsertService.insert(participationCommand, session, request);
		return "redirect:/contest";
	}
}