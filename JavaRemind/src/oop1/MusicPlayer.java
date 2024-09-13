package oop1;
// 음악플레이어라는 개념을 온전히 객체로 만드는 것에 집중
// 실행 순서보다는 필요한 데이터, 기능을 모아주는 즉, 클래스를 만드는 것 자체에 집중
// 사용에 대한 생각은 나중으로 미뤄두기
// 캡슐화 : 속성과 기능을 하나로 묶어 필요한 기능을 외부에 제공
public class MusicPlayer {
	
	// 속성
	int volume;
	boolean isOn;
	
	// 기능
	void on() {
		isOn=true;
		System.out.println("뮤직 플레이어 ON");
	}
	
	void off() {
		isOn=false;
		System.out.println("뮤직 플레이어 OFF");
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
