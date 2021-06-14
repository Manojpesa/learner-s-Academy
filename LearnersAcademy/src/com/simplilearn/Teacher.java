package com.simplilearn;

import java.util.Set;

public class Teacher {

	private long TEACHERID;
	private String name;
	private Set<Subject> teachersubjects;
	
	public Teacher() {
	}

	public Teacher(String name) {
		super();
		this.name = name;
	}

	public long getTEACHERID() {
		return TEACHERID;
	}

	public void setTEACHERID(long teacherID) {
		TEACHERID = teacherID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}
	
	public Set<Subject> getTeachersubjects() {
		return teachersubjects;
	}

	public void setTeachersubjects(Set<Subject> teachersubjects) {
		this.teachersubjects = teachersubjects;
	}
	
	public Set<Subject> getteachersubjects() {
		return teachersubjects;
	}

	public void setteachersubjects(Set<Subject> teachersubjects) {
		this.teachersubjects = teachersubjects;
	}
	
	
}
