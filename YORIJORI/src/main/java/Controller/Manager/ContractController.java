package Controller.Manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import Command.manager.ContractCommand;
import Command.manager.ManagerLoginCommand;
import Service.Manager.ContractInsertService;

@Controller
public class ContractController {

	@Autowired
	ContractInsertService contractInsertService;
	
	@RequestMapping("/contract")
	public String form() { 
		return "manager/contractForm";
	}
	
	@RequestMapping("/contractAction")
	public String contractAction(ContractCommand contractCommand, ManagerLoginCommand managerLoginCommand) {
		contractInsertService.insert(contractCommand);
		return "mart/martMain";
	}
	
}
