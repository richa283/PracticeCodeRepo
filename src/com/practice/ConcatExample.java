package com.practice;
	//Create two human Aman And Richa . 
class Aman{
	//aman contains properties like name, mobile, Place,  Company
	String name;
	String mobile;
	String place;
	String company;
		
	public Aman(String name, String mobile, String place, String company)
	{
		this.name=name;
		this.mobile=mobile;
		this.place=place;
		this.company=company;
	}
	public String toString()
	{
		return "Name: "+name+", Mobile: "+mobile+", Place: "+place+", Company: "+company;
	}
}
	
class Richa{
	//Richa Contains properties like Pay, Technology and designation
	double pay;
	String technology;
	String destination;
	
	public Richa(double pay, String technology, String destination)
	{
		this.pay=pay;
		this.technology=technology;
		this.destination=destination;
	}
	public String toString()
	{
		return ", Pay: "+pay+", Technology: "+technology+", Destination :"+destination;
	}
}

public class ConcatExample
{
	public static void main(String[] args)
	{
	//Now create 3 object of each Aman & Richa
	Aman aman1 = new Aman("Aman1", "123-456-7890", "City1", "Company1");
	Aman aman2 = new Aman("Aman2", "987-654-3210", "City2", "Company2");
	Aman aman3 = new Aman("Aman3", "555-555-5555", "City3", "Company3");
	
	Richa richa1 = new Richa(60000.0, "Java", "Developer");
	Richa richa2 = new Richa(75000.0, "Python", "Data Scientist");
	Richa richa3 = new Richa(80000.0, "C#", "Software Engineer");
	
	//And show the concated result of both the object
	//eg. Aman should have result like Name Mobile, place, Company, Pay, Technology, Designation
	//for all the three objects
	System.out.println("Output 1: " +aman1+ " " +richa1);
	System.out.println("Output 2: " +aman2+ " " +richa2);
	System.out.println("Output 3: " +aman3+ " " +richa3);
	}
}