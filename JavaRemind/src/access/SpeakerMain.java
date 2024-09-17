package access;

public class SpeakerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Speaker sp=new Speaker(90);
		sp.showVolume();
		
		sp.volumeUp();
	    sp.showVolume();
	    
	    sp.volumeUp();
	    sp.showVolume();
	    
	    // 필드에 직접 접근 => 접근 제어자가 없을 경우 직접 접근하여 수정이 가능 => 안정성을 보장할 수 없음
	    System.out.println("volume 필드 직접 접근 수정");
	    //sp.volume=200; // private 변수에 접근할 수 없음 => 컴파일 오류 발생
	    sp.showVolume();
	}

}
