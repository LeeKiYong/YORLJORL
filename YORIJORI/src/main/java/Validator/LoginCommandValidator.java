package Validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import Command.Login.LoginCommand;

public class LoginCommandValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		return LoginCommand.class.isAssignableFrom(clazz);
	}

	//target == LoginCommand  >> target == command
	public void validate(Object target, Errors errors) {
		//에러코드 출력 (errors, command의 필드명, 출력할 에러코드 변수)
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "id1", "required");
		ValidationUtils.rejectIfEmpty(errors, "pw", "required");
	}

}
