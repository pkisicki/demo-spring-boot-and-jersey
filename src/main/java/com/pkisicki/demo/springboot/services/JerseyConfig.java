package com.pkisicki.demo.springboot.services;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

/**
 * Jersey (web-services) configuration.
 */
@Component
public class JerseyConfig extends ResourceConfig {
	public JerseyConfig() {
		register(Hello.class);
	}
}
