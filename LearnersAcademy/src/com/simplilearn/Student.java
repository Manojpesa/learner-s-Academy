package com.simplilearn;

public class Student {

	private long STUDENTID;
	private String firstname;
	private String lastname;
	
	public Student()
	{}

	public Student(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public long getSTUDENTID() {
		return STUDENTID;
	}

	public void setSTUDENTID(long sTUDENTID) {
		STUDENTID = sTUDENTID;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getfirstname() {
		return firstname;
	}

	public void setfirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getlastname() {
		return lastname;
	}

	public void setlastname(String lastname) {
		this.lastname = lastname;
	}
	
}
