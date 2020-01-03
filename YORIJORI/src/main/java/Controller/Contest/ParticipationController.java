package Controller.Contest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import Command.Contest.ParticipationCommand;
import Command.manager.ManagerLoginCommand;
import Service.Contest.ParticipationFormService;
import Service.Contest.ParticipationInsertService;

@Controller
public class ParticipationController {
	
	@Autowired
	ParticipationInsertService participationInsertService;
	
	@Autowired
	ParticipationFormService participationFormService;

	@RequestMapping("/participation")
	public String form(ManagerLoginCommand managerLoginCommand, ParticipationCommand participationCommand, Model model) {
		participationFormService.contestNumSelect(model);
		return "contest/participationForm";
	}
	
	@RequestMapping("/participationInsert")
	public String participationInsert(ManagerLoginCommand managerLoginCommand, ParticipationCommand participationCommand, HttpSession session, HttpServletRequest request) {
		participationInsertService.insert(participationCommand, session, request);
		return "redirect:/contest";
	}
}
