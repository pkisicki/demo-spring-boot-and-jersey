package com.pkisicki.demo.springboot.services;

import javax.validation.constraints.NotNull;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

/**
 * Sample web-services.
 */
@Component
@Path("/")
public class Hello {
	/**
	 * Hello service
	 * 
	 * @return "Hello!"
	 */
	@GET
	@Path("/hello")
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainTextHello() {
		return "Hello!";
	}

	/**
	 * Reverse given input string.
	 * 
	 * @param input
	 * @return Reversed input
	 */
	@GET
	@Path("/reverse")
	public String reverse(@QueryParam("input") @NotNull String input) {
		return new StringBuilder(input).reverse().toString();
	}
}
