package com.practice;
	
class Amann{
	
	String name;
	String mobile;
	String place;
	String company;
		
	public Amann(String name, String mobile, String place, String company)
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
	
class Richaa{
	
	double pay;
	String technology;
	String company;
	
	public Richaa(double pay, String technology, String company)
	{
		this.pay=pay;
		this.technology=technology;
		this.company=company;
	}
	public String toString()
	{
		return ", Pay: "+pay+", Technology: "+technology+", Company :"+company;
	}
}

public class SameCompanyShow
{
	public static void main(String[] args)
	{
	
		Amann aman1 = new Amann("Kirti", "123-456-7890", "Banglore", "Capgemini");
		Amann aman2 = new Amann("Muskan", "987-654-3210", "Hyderabad", "TCS");
		Amann aman3 = new Amann("Kiran", "555-555-5555", "Pune", "Infosys");
	
		Richaa richa1 = new Richaa(60000.0, "Python", "Wipro");
		Richaa richa2 = new Richaa(75000.0, "Java", "Capgemini");
		Richaa richa3 = new Richaa(80000.0, "C#", "Google");
	
		if(aman1.company.contains(richa1.company))
		{
			System.out.println(aman1+ "" +richa1);
		}
		if(aman1.company.contains(richa2.company))
		{
			System.out.println(aman1+""+richa2);
		}
		if(aman1.company.contains(richa3.company))
		{
			System.out.println(aman1+""+richa3);
		}
		if(aman2.company.contains(richa1.company))
		{
			System.out.println(aman2+ "" +richa1);
		}
		if(aman2.company.contains(richa2.company))
		{
			System.out.println(aman2+""+richa2);
		}
		if(aman3.company.contains(richa3.company))
		{
			System.out.println(aman3+""+richa3);
		}
		if(aman3.company.contains(richa1.company))
		{
			System.out.println(aman3+ "" +richa1);
		}
		if(aman3.company.contains(richa2.company))
		{
			System.out.println(aman3+""+richa2);
		}
		if(aman3.company.contains(richa3.company))
		{
			System.out.println(aman3+""+richa3);
		}
	}
}