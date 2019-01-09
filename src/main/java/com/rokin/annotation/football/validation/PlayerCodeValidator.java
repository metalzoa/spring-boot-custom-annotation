package com.rokin.annotation.football.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PlayerCodeValidator implements ConstraintValidator<PlayerCode, String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if (value == null) {
			return true;
		}
		
		return value.startsWith("FP-");
	}

}
