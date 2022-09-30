package com.example.demo.validators.constraints;

import javax.validation.Constraint;

import com.example.demo.validators.DateOfBirthValidatorImpl;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Constraint(validatedBy = DateOfBirthValidatorImpl.class)
@Target(ElementType.FIELD)
public @interface DateOfBirthValidator {
	
    String message() default "Voting right at 18.";
    
}