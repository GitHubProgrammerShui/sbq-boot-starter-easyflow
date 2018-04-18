package com.sbq.easyflow.annotation;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Import;

import com.sbq.easyflow.EasyFlowConfiguration;

@Documented
@Retention(RUNTIME)
@Target(TYPE)
@Import(EasyFlowConfiguration.class)
public @interface EnableEasyFlow {
}
