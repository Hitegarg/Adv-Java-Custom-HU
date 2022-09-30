package com.example.demo.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.example.demo.validators.constraints.SalaryValidator;

public class SalaryValidatorImpl implements
	ConstraintValidator<SalaryValidator, Long> {

	@Override
	public void initialize(SalaryValidator constraintAnnotation) {
		// TODO Auto-generated method stub
		ConstraintValidator.super.initialize(constraintAnnotation);
	}
	
	@Override
	public boolean isValid(Long aLong, ConstraintValidatorContext constraintValidatorContext) {
		return aLong > 0;
	}
}