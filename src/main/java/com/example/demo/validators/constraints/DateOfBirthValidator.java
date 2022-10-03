package com.example.demo.validators.constraints;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.example.demo.validators.DateOfBirthValidatorImpl;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import java.lang.annotation.RetentionPolicy;

@Constraint(validatedBy = DateOfBirthValidatorImpl.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface DateOfBirthValidator {
    String message() default "The birth date must be greater than or equal to 18.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}