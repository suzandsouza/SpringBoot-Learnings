package com.setter.example.injection;


public class Car {
	private Specification specification;
	
	



	public void setSpecification(Specification specification) {
		this.specification = specification;
	}



	//here we write the displace method
	public void display() {
		System.out.println(specification.toString());
	}
}
