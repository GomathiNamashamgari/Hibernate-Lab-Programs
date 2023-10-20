package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="stu_id")
	private int id;
	
	@Column(name="stu_name")
	private String name;
	
	@Column(name="stu_marks")
	private int marks;
	
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
	public int getMarks()
	{
		return marks;
	}
	public void setMarks(int marks)
	{
		this.marks = marks;
	}
	public Student(int id, String name, int marks)
	{
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public Student()
	{
		super();
		// TODO Auto-generated constructor stub
	}

}
