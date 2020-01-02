package Service.Chef;

import org.springframework.beans.factory.annotation.Autowired;

import Command.Chef.ChefSignUpCommand;
import Model.DTO.ChefSignUpDTO;
import Repository.Chef.ChefSignUpRepository;

public class ChefSignUpProService {
	@Autowired
	private ChefSignUpRepository chefSignUpRepository;
	
	public Integer regist(Integer num, ChefSignUpCommand chefSignUpCommand) {
		ChefSignUpDTO chefSignUpDTO = new ChefSignUpDTO();
		System.out.println("서비스");
		chefSignUpDTO.setMemNum(num);
		chefSignUpDTO.setCareer(chefSignUpCommand.getCareer());
		chefSignUpDTO.setIntro(chefSignUpCommand.getIntro());
		chefSignUpDTO.setLicense(chefSignUpCommand.getLicense());
		System.out.println(chefSignUpDTO.getCareer());
		System.out.println(chefSignUpDTO.getIntro());
		System.out.println(chefSignUpDTO.getLicense());
		Integer result = chefSignUpRepository.chefSignUp(chefSignUpDTO);
		return result;
	}
}