package ch07_2_polymorphism;


	class A {}
	
	class B extends A {}
	class C extends A {}
	
	class D extends B {}
	class E extends C {}
	
	
//	class Hathaway {}
	
	
	
	public class PromotionExample {
		public static void main (String[] args) {
			B b = new B();
			C c = new C();
			D d = new D();
			E e = new E();
			
			
//			Hathaway gundam = new Hathaway ();
//			gundam.hashCode();
//			Object obj1 = gundam;
			
			
			
			A a1 = b;
			A a2 = c;
			A a3 = d;
			A a4 = e;
					
			B b1 = d;
			C c1 = e;
			
			//B b3 = e;
			//C c2 = d;
			
		}
		
	}


