package com.example.demo.validators;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.example.demo.validators.constraints.DateOfBirthValidator;

public class DateOfBirthValidatorImpl implements ConstraintValidator<DateOfBirthValidator, Date> {

	@Override
	public void initialize(DateOfBirthValidator constraintAnnotation) {
		ConstraintValidator.super.initialize(constraintAnnotation);
	}

	@Override
	public boolean isValid(Date date, ConstraintValidatorContext constraintValidatorContext) {
		System.out.println("Debug");
		LocalDate currentDate = LocalDate.now();
		Date validDate = Date.from(currentDate.minusYears(18).atStartOfDay(ZoneId.systemDefault()).toInstant());
		System.out.println("date:" + date);
		System.out.println("validDate:" + validDate);
		System.out.println("currentDate:" + currentDate);
		System.out.println("Debug");
		return date.equals(validDate) || date.before(validDate);
	}
}
