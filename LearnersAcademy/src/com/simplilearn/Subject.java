package com.simplilearn;

public class Subject {

	private long SUBJECTID;
	private String subjectname;
	private String teachername;
	private String classname;
	
	public Subject() {
		
	}

	public Subject(String subjectName, String teacherName) {
		super();
		this.subjectname = subjectName;
		this.teachername = teacherName;
	}

	public long getSUBJECTID() {
		return SUBJECTID;
	}

	public void setSUBJECTID(long sUBJECTID) {
		SUBJECTID = sUBJECTID;
	}

	public String getSubjectName() {
		return subjectname;
	}

	public void setSubjectName(String subjectName) {
		this.subjectname = subjectName;
	}
	
	public String getsubjectname() {
		return subjectname;
	}

	public void setsubjectname(String subjectName) {
		this.subjectname = subjectName;
	}

	public String getTeacherName() {
		return teachername;
	}

	public void setTeacherName(String teacherName) {
		this.teachername = teacherName;
	}
	
	public String getteachername() {
		return teachername;
	}

	public void setteachername(String teacherName) {
		this.teachername = teacherName;
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
}
