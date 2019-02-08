package com.rokin.annotation.football.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = PlayerCodeValidator.class)
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface PlayerCode {

	public String value() default "FP-";

	public String message() default "Player code must start with FP-";
	
	public String messageEmpty() default "Player code must not be null";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
