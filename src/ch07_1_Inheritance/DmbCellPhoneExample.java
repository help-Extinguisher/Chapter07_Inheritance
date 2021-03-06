package ch07_1_Inheritance;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		// DmbCellPhone 객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
		
		//CellPhone 클래스로부터 상속받은 필드
		System.out.println("모델 : "+  dmbCellPhone.model);
		System.out.println("색상 : " + dmbCellPhone.color);
		
		//DmbCellPhone 클래스의 필드
		System.out.println("채널 : " + dmbCellPhone.channel);
		
		//CellPhone 클래스로부터 상속받은 메소드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요.");
		dmbCellPhone.receiveVoice("뭐하냐? 시간있어? 일이있어서 말인데");
		dmbCellPhone.sendVoice("...그렇습니까.");
		dmbCellPhone.hangUp();
		
		//DmbCellPhone 클래스의 메소드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}

}
