package oop1;

public class MusicPlayerMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int volume=0;
		boolean isOn=false;
		
		// 음악 플레이어 켜기
		isOn=true;
		System.out.println("플레이어 시작");
		
		// 볼륨 증가
		volume++;
		System.out.println("플레이어 볼륨:"+volume);
		
		// 볼륨 증가
		volume++;
		System.out.println("플레이어 볼륨:"+volume);
		
		// 볼륨 감소
		volume--;
		System.out.println("플레이어 볼륨:"+volume);
		
		// 음악 플레이어 상태
		if(isOn) {
			System.out.println("플레이어 ON, 볼륨:"+volume);
		}
		
		// 음악 플레이어 종료
		isOn=false;
		System.out.println("플레이어 종료");
		
		// 음악 플레이어 상태
		if(isOn) {
			System.out.println("플레이어 ON");
		}
		else {
			System.out.println("플레이어 OFF");
		}
	}

}
