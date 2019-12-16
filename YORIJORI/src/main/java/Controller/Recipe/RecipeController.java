package Controller.Recipe;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RecipeController {
	
	// 레시피 메인페이지 이동
	@RequestMapping("/recipeMain")
	public String recipeMain() {
		System.out.println("레시피메인컨트롤러");
		return "recipe/recipeMain";
	}
}
