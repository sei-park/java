package tr;

import ch07.second.Phone;

public class PhoneEx {

	public static void main(String[] args) {
		
		PhoneTr phoneTr = new PhoneTr();
		
		phoneTr.phoneCall();
		
		MobilePhoneTr moPhoneTr = new MobilePhoneTr();
		
		moPhoneTr.phoneCall();
		
		MusicPhoneTr musicPhoneTr = new MusicPhoneTr();
		
		musicPhoneTr.phoneCall();
	}

}
