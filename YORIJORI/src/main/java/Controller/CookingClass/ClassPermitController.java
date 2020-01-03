package Controller.CookingClass;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import Model.DTO.ClassplanDTO;

@Controller
public class ClassPermitController {
	
	@RequestMapping("/ClassPermit")
	public String ClassPermit(ClassplanDTO plan) {
		return "manager/ClassPermit";
	}
}
