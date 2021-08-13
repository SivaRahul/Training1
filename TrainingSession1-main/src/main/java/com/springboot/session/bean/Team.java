package com.springboot.session.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Team 
{
	@Value("${spring.app.teamName}")
	private String teamName;
	@Value("${spring.app.teamSize}")
	private int teamSize;
	@Value("${spring.app.teamLeader}")
	private String teamLeader;
	/**
	 * @return the team
	 */
	public String getTeamName() {
		return teamName;
	}
	/**
	 * @param team the team to set
	 */
	public void setTeam(String teamName) {
		this.teamName = teamName;
	}
	/**
	 * @return the teamSize
	 */
	public int getTeamSize() {
		return teamSize;
	}
	/**
	 * @param teamSize the teamSize to set
	 */
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	/**
	 * @return the teamLeader
	 */
	public String getTeamLeader() {
		return teamLeader;
	}
	/**
	 * @param teamLeader the teamLeader to set
	 */
	public void setTeamLeader(String teamLeader) {
		this.teamLeader = teamLeader;
	}
	@Override
	public String toString() {
		return "Team [teamName=" + teamName + ", teamSize=" + teamSize + ", teamLeader=" + teamLeader + "]";
	}
}
