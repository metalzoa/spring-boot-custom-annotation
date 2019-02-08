package com.rokin.annotation.football.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PlayerCodeValidator implements ConstraintValidator<PlayerCode, String> {
	
	private String messageEmpty;
	private String message;

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
        context.disableDefaultConstraintViolation();

		if (value == null || value.isEmpty()) {
            context.buildConstraintViolationWithTemplate(messageEmpty).addConstraintViolation();
			return false;
		} else if (!value.startsWith("FP-")) {
			context.buildConstraintViolationWithTemplate(message).addConstraintViolation();
			return false;
		}
		
		return true;
	}
	
	@Override
    public void initialize(PlayerCode playerCode) {
		messageEmpty = playerCode.messageEmpty();
		message = playerCode.message();
    }

}
