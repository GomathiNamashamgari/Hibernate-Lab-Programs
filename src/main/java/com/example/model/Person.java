package com.example.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="person_id")
	private int id;
	
	@Column(name="person_Name")
	private String name;
	
	@OneToOne(mappedBy="person",cascade=CascadeType.ALL)
	private Passport passport;
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public Passport getPassport()
	{
		return passport;
	}
	public void setPassport(Passport passport)
	{
		this.passport = passport;
	}
	public Person(int id, String name, Passport passport)
	{
		super();
		this.id = id;
		this.name = name;
		this.passport = passport;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

}