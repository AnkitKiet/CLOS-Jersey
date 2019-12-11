package com.test;

import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.server.ResourceConfig;

import com.test.providers.AuthenticationFilter;

public class CustomApplication extends ResourceConfig {
	public CustomApplication() {
		packages("com.howtodoinjava.jersey");
		register(LoggingFilter.class);

		// Register Auth Filter here
		register(AuthenticationFilter.class);
	}
}