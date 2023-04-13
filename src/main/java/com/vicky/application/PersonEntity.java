package com.vicky.application;



public class PersonEntity {
	
	
	private Integer id ;
	private String firstname;
	private String lastname;
	
	public PersonEntity() {
		// TODO Auto-generated constructor stub
	}

	public PersonEntity(Integer id, String firstname, String lastname) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "PersonEntity [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + "]";
	}
	
	
   
}
