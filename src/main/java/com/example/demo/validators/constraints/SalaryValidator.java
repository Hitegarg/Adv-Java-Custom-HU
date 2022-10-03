package com.example.demo.validators.constraints;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.example.demo.validators.SalaryValidatorImpl;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = SalaryValidatorImpl.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SalaryValidator {
    String message() default "User.class: salary parameter should be greater than 0.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}