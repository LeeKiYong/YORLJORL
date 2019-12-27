package Validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import Command.manager.ManagerLoginCommand;

public class ManagerLoginCommandValidator implements Validator{

	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return ManagerLoginCommand.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "mid", "required");
		ValidationUtils.rejectIfEmpty(errors, "mpw", "required");
	}
	
}
