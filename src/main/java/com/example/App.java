package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/*import com.example.model.Student;*/
import com.example.model.Passport;
import com.example.model.Person;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        try 
        {
        	Person p1=new Person();
        	p1.setName("Rohit");
        	
        	Passport pn=new Passport();
        	pn.setPassportnumber("AB1245787");
        	
        	p1.setPassport(pn);
        	pn.setPerson(p1);
        	
        	session.beginTransaction();
        	session.save(p1);
        	session.getTransaction().commit();
        	
        	Person a1=session.get(Person.class, p1.getId());
        	Passport a2=a1.getPassport();
        	
        	System.out.println("Person name: "+a1.getName());
        	System.out.println("Passport number: "+a2.getPassportnumber());
        	/*
        	Student e1=new Student();
        	e1.setName("Ramya");
        	e1.setMarks(85);
        	session.beginTransaction();
        	session.save(e1);
        	session.getTransaction().commit();
        	
        	Student e2=new Student();
        	e2.setName("Arjun");
        	e2.setMarks(87);
        	session.beginTransaction();
        	session.save(e2);
        	session.getTransaction().commit();
        	*/
        	
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
        finally 
        {
        	session.close();
        	factory.close();
        }
    }
}