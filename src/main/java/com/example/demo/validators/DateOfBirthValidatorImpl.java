package com.example.demo.validators;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.example.demo.validators.constraints.DateOfBirthValidator;

public class DateOfBirthValidatorImpl implements
	ConstraintValidator<DateOfBirthValidator, Date> {
	
	@Override
	public void initialize(DateOfBirthValidator constraintAnnotation) {
		// TODO Auto-generated method stub
		ConstraintValidator.super.initialize(constraintAnnotation);
	}

	@Override
	public boolean isValid(Date date, ConstraintValidatorContext constraintValidatorContext) {
		LocalDate currentDate = LocalDate.now();
		Date validDate = Date.from(currentDate.minusYears(18).atStartOfDay(ZoneId.systemDefault()).toInstant());
		return date.equals(validDate) || date.before(validDate);
	}
}
