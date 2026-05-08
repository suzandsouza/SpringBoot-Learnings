package car.constructor.injection;


public class Car {
	private Specification specification;
	
	public Car(Specification specification) {
		super();
		this.specification = specification;
	}

	//here we write the displace method
	public void display() {
		System.out.println(specification.toString());
	}
}
