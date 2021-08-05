package ch07_2_polymorphism;

	public class ChildExample {
		public static void main(String[] args) {
			Child child = new Child();
			
			
			
			Parent parent = child;
			parent.method1();
			parent.method2();
//			parent.method3();
		}
	}




//class Parent {
//
//	// 필드
//	public String p_str = "Parent String...졸리다ㅠㅠ"; 
//		
//	// 생성자
//	
//	// 메소드
//	void print() {
//		System.out.println(p_str);
//	}
//	
//
//}
//
//class Child extends Parent {
//
//	// 필드
//	public String c_str = "Child Stirng....아이고 졸려라";
//	
//	
//	
//	// 생성자
//	
//	// 메소드
//	void display () {
//		System.out.println('♡');
//	}
//
//		@Override
//		void print() {
////			System.out.println("올라탔다!");
//			display();
//		}
//	
//}
//
//
//
//
//
//public class ChildExample {
//	public static void main(String[] args) {
//		
//		Child c = new Child();
//		c.print();
//		
//		
//	}
//
//}
