package Validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import Command.Contest.ContestCommand;

public class ContestCommandValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return ContestCommand.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "contestName", "required");
		ValidationUtils.rejectIfEmpty(errors, "contestStart", "required");
		ValidationUtils.rejectIfEmpty(errors, "contestEnd", "required");
	}

}
