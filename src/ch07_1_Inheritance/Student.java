package ch07_1_Inheritance;

public class Student extends People {
	
	// �ʵ�
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}

}
