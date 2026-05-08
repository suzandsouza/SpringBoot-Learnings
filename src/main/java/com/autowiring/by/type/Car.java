package com.autowiring.by.type;


public class Car {
	private Specification specification1;
	
	//Autowiring by name will not need constructor
	// it will need a setter
	//it will search the object name of the dependent class 
	//in this case specification
	
	
//	public Car(Specification specification) {
//		super();
//		this.specification = specification;
//	}

	//here we write the displace method
	public void display() {
		System.out.println(specification1.toString());
	}

	//name of the setter should match the name of the object
	public void setSpecification1(Specification specification1) {
		this.specification1 = specification1;
	}
}
