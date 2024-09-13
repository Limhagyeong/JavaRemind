package oop1;

import java.util.Scanner;

public class MusicPlayerMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicPlayerData data=new MusicPlayerData();
		
		data.on();
		data.volumeUp();
		data.volumeUp();
		data.volumeDown();
		data.playerStatus();
		data.off();
		data.playerStatus();
	}

}
