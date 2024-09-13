package oop1;

import java.util.Scanner;

// 절차지향프로그램의 한계
// 데이터와 데이터를 사용하는 기능이 매우 밀접하게 연관 되어있음
// but 데이터와 메소드가 분리되어있어 데이터 수정 시 메소드 하나하나 수정해줘야함
// 유지보수 관점에서도 관리 포인트가 두군데가 됨
//=> 이를 보완하여 나온게 객체지향프로그래밍

public class MusicPlayerMain4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicPlayerData data=new MusicPlayerData();
		
		on(data);
		volumeUp(data);
		volumeUp(data);
		volumeDown(data);
		playerStatus(data);
		off(data);
		playerStatus(data);
	}
	
	static void on(MusicPlayerData data) {
		data.isOn=true;
		System.out.println("플레이어 시작");
	}
	
	static void off(MusicPlayerData data) {
		data.isOn=false;
		System.out.println("플레이어 종료");
	}
	
	static void volumeUp(MusicPlayerData data) {
		data.volume++;
		System.out.println("플레이어 볼륨:"+data.volume);
	}
	
	static void volumeDown(MusicPlayerData data) {
		data.volume--;
		System.out.println("플레이어 볼륨:"+data.volume);
	}
	
	static void playerStatus(MusicPlayerData data) {
		if(data.isOn) {
			System.out.println("플레이어 ON");
		}
		else {
			System.out.println("플레이어 OFF");
		}
	}

}
