package ch07_1_Inheritance;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		// DmbCellPhone ��ü ����
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���", "����", 10);
		
		//CellPhone Ŭ�����κ��� ��ӹ��� �ʵ�
		System.out.println("�� : "+  dmbCellPhone.model);
		System.out.println("���� : " + dmbCellPhone.color);
		
		//DmbCellPhone Ŭ������ �ʵ�
		System.out.println("ä�� : " + dmbCellPhone.channel);
		
		//CellPhone Ŭ�����κ��� ��ӹ��� �޼ҵ� ȣ��
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������.");
		dmbCellPhone.receiveVoice("���ϳ�? �ð��־�? �����־ ���ε�");
		dmbCellPhone.sendVoice("...�׷����ϱ�.");
		dmbCellPhone.hangUp();
		
		//DmbCellPhone Ŭ������ �޼ҵ� ȣ��
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}

}
