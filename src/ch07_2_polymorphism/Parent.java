package ch07_2_polymorphism;

public class Parent {
	
	String Charactor;
	public Parent (String charactor) {
		this.Charactor = charactor;
		
	}
	
	
	public void act() {
		System.out.println(Charactor);
		
	}
	
	
	
	public void method1 () {
		System.out.println("Parent-method1()");
	}
	
	public void method2() {
		System.out.println("Parent-method2()");
	}
	
//	public void makeCharactor() {
//		System.out.println("¿Â¼ø");
//	}

}
