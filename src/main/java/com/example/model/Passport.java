package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="passport")
public class Passport
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="passport_id")
	private int id;
	
	@Column(name="passport_number")
	private String passportnumber;
	
	@OneToOne
	@JoinColumn(name="person_id")
	private Person person;
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getPassportnumber()
	{
		return passportnumber;
	}
	public void setPassportnumber(String passportnumber)
	{
		this.passportnumber = passportnumber;
	}
	public Person getPerson()
	{
		return person;
	}
	public void setPerson(Person person)
	{
		this.person = person;
	}
	public Passport(int id, String passportnumber, Person person)
	{
		super();
		this.id = id;
		this.passportnumber =passportnumber;
		this.person = person;
	}
	public Passport()
	{
		super();
		// TODO Auto-generated constructor stub
	}

}