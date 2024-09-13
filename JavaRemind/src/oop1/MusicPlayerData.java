package oop1;

public class MusicPlayerData {
	int volume;
	boolean isOn;
	
	void on() {
		isOn=true;
		System.out.println("플레이어 시작");
	}
	
	void off() {
		isOn=false;
		System.out.println("플레이어 종료");
	}
	
	void volumeUp() {
		volume++;
		System.out.println("플레이어 볼륨:"+volume);
	}
	
	void volumeDown() {
		volume--;
		System.out.println("플레이어 볼륨:"+volume);
	}
	
	void playerStatus() {
		if(isOn) {
			System.out.println("플레이어 ON");
		}
		else {
			System.out.println("플레이어 OFF");
		}
	}
	
}
