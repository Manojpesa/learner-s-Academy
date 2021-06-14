package com.simplilearn;

import java.util.Set;

public class ClassMaster {
	
	 private long ID;
     private String classname;
     private String classteacher;
     private Set<Subject> subject;
     private Set<Student> student; 
     
     public ClassMaster()
     {
    	 
     }

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}
	
	public String getclassname() {
		return classname;
	}

	public void setclassname(String classname) {
		this.classname = classname;
	}

	public String getClassteacher() {
		return classteacher;
	}

	public void setClassteacher(String classteacher) {
		this.classteacher = classteacher;
	}
	
	public String getclassteacher() {
		return classteacher;
	}

	public void setclassteacher(String classteacher) {
		this.classteacher = classteacher;
	}

	public Set<Subject> getSubject() {
		return subject;
	}

	public void setSubject(Set<Subject> subject) {
		this.subject = subject;
	}

	public Set<Student> getStudent() {
		return student;
	}

	public void setStudent(Set<Student> student) {
		this.student = student;
	}

	public Set<Subject> getsubject() {
		return subject;
	}

	public void setsubject(Set<Subject> subject) {
		this.subject = subject;
	}

	public Set<Student> getstudent() {
		return student;
	}

	public void setstudent(Set<Student> student) {
		this.student = student;
	}
	
}
