package com.springboot.session;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;

import com.springboot.session.bean.Team;

@SpringBootApplication
public class SpringSessionApplication //extends SpringBootServletInitializer // for external tomcat configuration
{
	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(SpringSessionApplication.class, args);
		final Team team = ctx.getBean(Team.class);
		System.out.println("--- Team ---");
		System.out.println(team.toString());
	}
	
	// to Set external tomcat server
	/*
	 * @Override protected SpringApplicationBuilder
	 * configure(SpringApplicationBuilder builder) { return
	 * builder.sources(SpringSessionApplication.class); }
	 */
	


}
