package Controller.Contest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import Command.Contest.ParticipationCommand;
import Service.Contest.ParticipationInsertService;

@Controller
public class ParticipationController {
	
	@Autowired
	ParticipationInsertService participationInsertService;

	@RequestMapping("contest/participation")
	public String form(ParticipationCommand participationCommand) {
		return "contest/participationForm";
	}
	
	@RequestMapping("participation/participationInsert")
	public String participationInsert(ParticipationCommand participationCommand, HttpSession session, HttpServletRequest request) {
		participationInsertService.insert(participationCommand, session, request);
		return "contest/mainContest";
	}
}
