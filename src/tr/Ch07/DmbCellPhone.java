package tr.Ch07;

public class DmbCellPhone extends CellPhone {

	@Override
	void bell() {
		System.out.println("벨이 울립니다.222");
	}

	@Override
	void sendVoice(String message) {
		System.out.println(message + "메세지를 보냅니다.222" );
	}

	public int channel;
	
	void turnOnDmb() {
		channel = 1;
		System.out.println("채널 " + channel);
	}
	
	void changeChannelDmb(int channels) {
		this.channel = channels;
		System.out.println("채널 " + channels);
	}

}
