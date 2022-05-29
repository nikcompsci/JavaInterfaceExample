package com.example.usingInterface;

class Dog extends Canine implements Clipper {
	  @Override
	  public String buzzer() {
	    return "Dog --> clippercut an option";
	  }
	  @Override
	  public String pestControl() {
		  return "Dog --> flea shampoo is an option";
	  }
}