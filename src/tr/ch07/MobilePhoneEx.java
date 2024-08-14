package tr.ch07;

public class MobilePhoneEx {

	public static void main(String[] args) {
		
		CellPhone cellPhone = new CellPhone();
		
		cellPhone.powerOn();
		cellPhone.powerOff();
		
		DmbCellPhone dmbCellPhone = new DmbCellPhone();
		
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("hello ");
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(2);
		
	}

}
