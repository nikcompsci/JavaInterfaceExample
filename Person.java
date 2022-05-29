package com.example.usingInterface;

class Person extends Human implements Clipper {
	@Override
	public String buzzer() {
	  return "Person --> clippercut is an option";
	} 
	@Override
	public String hairColor() {
	  return "Person --> hair color is an option";
}
}