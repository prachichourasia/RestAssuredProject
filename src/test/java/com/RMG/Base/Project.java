package com.RMG.Base;


//Pojo class
public class Project {

	String createdBy;
	String createdOn;
	String projectName;
	String status;
	int teamSize;
	
	
	public Project(String createdBy, String createdOn, String projectName, String status, int teamSize) {
		super();
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.projectName = projectName;
		this.status = status;
		this.teamSize = teamSize;
	}
	
	public Project()
	{
		
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public String getCreatedOn() {
		return createdOn;
	}
	public String getProjectName() {
		return projectName;
	}
	public String getStatus() {
		return status;
	}
	public int getTeamSize() {
		return teamSize;
	}
	
	
	
	
	
	
}
