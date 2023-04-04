package org.timnielsen.Vampire.controllers;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.apache.commons.beanutils.BeanUtils;

public class FieldMatchValidator implements ConstraintValidator<FieldMatch, Object> {
   private String firstFieldValue;
   private String secondFieldValue;

   @Override
   public void initialize(final FieldMatch constraintAnnotation) {
       firstFieldValue = constraintAnnotation.passOne();
       secondFieldValue = constraintAnnotation.passTwo();
   }

   @Override
   public boolean isValid(final Object value, final ConstraintValidatorContext context) {
       try {
           final Object firstObj = BeanUtils.getProperty(value, firstFieldValue);
           final Object secondObj = BeanUtils.getProperty(value, secondFieldValue);
           return firstObj == null && secondObj == null || firstObj != null && firstObj.equals(secondObj);
       } catch (final Exception ignore) {}
       return true;
   }
}


