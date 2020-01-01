package Service.CookingClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Model.DTO.ClassplanDTO;
import Repository.Cooking.CookingRepository;

@Service
public class ClassDetailService {
	@Autowired
	CookingRepository cookingRepository;

	public void classDetail(Model model, Integer classNum) {
		ClassplanDTO plan = cookingRepository.classDetail(classNum);
		
		model.addAttribute("plan", plan);
		
	}

}
