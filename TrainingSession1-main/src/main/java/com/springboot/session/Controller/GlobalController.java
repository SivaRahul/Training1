package com.springboot.session.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.session.bean.Team;

@RestController
@RequestMapping("/")
public class GlobalController
{

	@Autowired
	Team team;
	
	@GetMapping(value = "{name}")
	public String getWelcomeMessage(@PathVariable("name") String name)
	{
		return "welcome "+name +" to  SpringBoot Application";
	}
	
	@GetMapping(value = "teamDetails")
	public String getTeamDetails()
	{
		return team.toString();
	}
	
}
