package ch07_2_polymorphism;

public class Child extends Parent {
	
	public Child(String charactor) {
		super(charactor);
		
	}
	
	

	@Override
	public void act() {
		super.act();
	}



	@Override
	public void method2() {
		System.out.println("Child-method2()");
	}
	
	public void method3() {
		System.out.println("Child-method3()");
	
	}
}
