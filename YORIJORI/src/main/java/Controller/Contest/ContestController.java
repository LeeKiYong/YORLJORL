package Controller.Contest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Command.Contest.ContestCommand;
import Command.manager.ManagerLoginCommand;
import Service.Contest.ContestCreateService;
import Validator.ContestCommandValidator;

@Controller
public class ContestController {

	@Autowired
	ContestCreateService contestCreateService;
	
	@RequestMapping("/contest")
	public String contestMain(ManagerLoginCommand managerLoginCommand) {
		return "contest/contestMain";
	}
	
	
	@RequestMapping("/contest/regForm")
	public String contestForm(ManagerLoginCommand managerLoginCommand, ContestCommand contestCommand) {
		return "contest/contestForm";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/contest/regAction")
	public String contestCreateAction(ManagerLoginCommand managerLoginCommand, ContestCommand contestCommand, Errors errors) {
		
		//유효성 검사.
		new ContestCommandValidator().validate(contestCommand, errors);
		if(errors.hasErrors()) {
			System.out.println("hasErrors 실행한다?????????????");
			return "contest/contestForm";
		}
		
		Integer result = contestCreateService.create(contestCommand);
		if(result == null) {
			System.out.println("아이디 중복 실행되냐아ㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏ");
			errors.rejectValue("contestName", "duplicate1");
			return "contest/contestForm";
		}
		return "redirect:/contest";
	}
	
}
