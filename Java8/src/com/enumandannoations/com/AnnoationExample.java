package com.enumandannoations.com;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target( { ElementType.FIELD, ElementType.METHOD } )
@Inherited
public @interface AnnoationExample {
	DayOfWeeks[] getWeeks();
}
