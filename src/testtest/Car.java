package testtest;

public class Car {
	int cc;
	String model = "";
	String color = "";
	String company = "";
	
	
	Car() {
		
	}
	
	Car(String color, int cc){
		this.color = color;
		this.cc = cc;
	}
	
	
//	Car(String color, int cc) {
//		this ("color", 0);
//	}

		
		Car(String color, int cc, String model){
			this.color = color;
			this.cc = cc;
			this.model = model;
		}
			
			
		Car(String color, int cc, String model, String company){
			this.color = color;
			this.cc = cc;
			this.model = model;
			this.company = company;
	}

		
		

		public void run() {
			System.out.println(color + "색" + cc + "cc차가 달린다~~~");

			
		}

}
