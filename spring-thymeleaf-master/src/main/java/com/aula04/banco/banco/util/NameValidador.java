package com.aula04.banco.banco.util;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Locale;

public class NameValidador implements ConstraintValidator<Name, String>{

    @Override
    public void initialize(Name constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String name, ConstraintValidatorContext context) {
        String nameFormat = name.replaceAll("\\s", "").toLowerCase(Locale.ROOT);

        if(nameFormat == null ||
                nameFormat.length() < 3  ||
                nameFormat.equals("palavrao") ||
                nameFormat.equals("palavrão")){return  false;}
        return true;
    }
}

