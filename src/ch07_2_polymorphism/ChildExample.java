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
//	// �ʵ�
//	public String p_str = "Parent String...�����٤Ф�"; 
//		
//	// ������
//	
//	// �޼ҵ�
//	void print() {
//		System.out.println(p_str);
//	}
//	
//
//}
//
//class Child extends Parent {
//
//	// �ʵ�
//	public String c_str = "Child Stirng....���̰� ������";
//	
//	
//	
//	// ������
//	
//	// �޼ҵ�
//	void display () {
//		System.out.println('��');
//	}
//
//		@Override
//		void print() {
////			System.out.println("�ö�����!");
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
