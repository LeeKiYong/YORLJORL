package Controller.CookingClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Service.CookingClass.ClassDetailService;

@Controller
public class ClassDetailController {
	@Autowired
	ClassDetailService classDetailService;
	
	@RequestMapping("/classDetail")
	public String classDetail(@RequestParam("num") Integer classNum, Model model) {
		classDetailService.classDetail(model, classNum);
		
		return "cookingClass/ClassDetail";
	}
}
