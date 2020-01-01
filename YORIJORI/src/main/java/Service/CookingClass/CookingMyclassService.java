package Service.CookingClass;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Command.CookingClass.CookingCommand;
import Model.DTO.ClassplanDTO;
import Repository.Cooking.CookingRepository;

@Service
public class CookingMyclassService {
	@Autowired
	CookingRepository cookingRepository;

	public Integer classWrite(CookingCommand cookingCommand, HttpServletRequest request) {
		ClassplanDTO plan = new ClassplanDTO();
		
		plan.setChefName(cookingCommand.getChefName());
		plan.setClassName(cookingCommand.getClassName());
		plan.setClassGoal(cookingCommand.getClassGoal());
		plan.setClassSub(cookingCommand.getClassSub());
		plan.setClassCost(cookingCommand.getClassCost());
		plan.setClassMate(cookingCommand.getClassMate());
		plan.setClassDate(cookingCommand.getClassDate());
		plan.setClassPlace(cookingCommand.getClassPlace());
		plan.setClassPsn(cookingCommand.getClassPsn());
		
		Integer result = cookingRepository.planInsert(plan);
		return result;
		
	}

}
