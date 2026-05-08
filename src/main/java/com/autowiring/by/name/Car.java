package com.autowiring.by.name;


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
	
	//AUTOWIRING BY TYPE WILL SEARCH FOR A SINGLE BEAN OF THE THAT TYPE
	//IT CANNOT HAVE MORE THAN ONE BEAN OF THE SAME TYPE (I.E. OF THE SAME CLASS)
	//IT IS VERY LOYAL TO ITS TYPE
	public void display() {
		System.out.println(specification1.toString());
	}

	//name of the setter should match the name of the object
	public void setSpecification1(Specification specification1) {
		this.specification1 = specification1;
	}
}
