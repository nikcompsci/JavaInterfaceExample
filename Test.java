package com.example.usingInterface;

import java.util.*; 
public class Test {
  public static void main(String[] args) {
	  
	  ArrayList<Human> humanClient = new ArrayList<Human>();   
	  Person Jill = new Person();
	  humanClient.add(Jill);
	  
	  ArrayList<Canine> dogClient = new ArrayList<Canine>();  
	  Dog Scruffy = new Dog();
	  dogClient.add(Scruffy);  
	     
	  System.out.println("---------------------------------------------- "); 
	  System.out.println("Object Oriented Programming - Client Profile:");  
	   System.out.println("---------------------------------------------- ");
	   if(Scruffy instanceof Canine)
		   System.out.println("\nScruffy is a dog." + "\n\tInheriting the pestControl() method from it's Canine superclass to override: \n\t\t" + Scruffy.pestControl() 
		   + "\n\n\tUtilizing the clipper interface: \n\t\t" + Scruffy.buzzer()); 
	   
	   if(Jill instanceof Human)
		   System.out.println("\n\nJill is a person." + "\n\tInheriting the hairColor() method from it's Human superclass to override: \n\t\t" + Jill.hairColor() 
		   + "\n\n\tUtilizing the clipper interface: \n\t\t" + Jill.buzzer());
  }
}  