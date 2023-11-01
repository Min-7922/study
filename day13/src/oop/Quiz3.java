package oop;

import java.util.Scanner;

class TV {
	// TV의 속성을 필드로 작성하세요
	// 전원, 채널, 볼륨 그 외 필요하다고 생각하는 필드를 자유롭게 작성하세요
	
	boolean power;
	int channel;
	int volume;
	int zero;
	
	// TV의 기능을 메서드로 정의하세요
	// 전원 on/off, 채널올림/내림, 볼륨 올림/내림, TV상태 출력, 음소거
	// 채널은 일정 범위 안에서 cycle형식으로 순환되어야 합니다
	// 볼륨은 일정 범위 안에서 최소 최대치를 넘길 수 없습니다
	// 음소거는 한번 누르면 볼륨이 0이 되었다가 다시 누르면 원래 볼륨으로 복구되어야 한다.
	// 대부분의 기능은 전원이 켜져있는 상태에서만 작동해야 한다
	
	void turn() {	// 전원 on/off
		power = !power;
	}
	
	void channelUp() {	// 채널올림
		if(power) {
			channel ++;
			if(channel==11) channel = 1;
		}
	}
	void channelDown() {	// 채널내림
		if(power) {
			channel --;
			if(channel == 0) channel = 10;
		}
	}
	
	void volumeUp() {
		if(power && zero ==0) {
			if(volume<10) volume += 1;
		}
		
	}
	
	void volumeDown() {
		if(power && zero ==0) {
			if(volume>0) volume -= 1;
		}
	}
	
	void mute() {
		if(power)
		if(volume!=0) {
			zero = volume; 
			volume = 0;
		}else {
			volume = zero;
			zero=0;
		}
	}
	
	void show() {
		if(power) {
			System.out.printf("┌───────────────────────┐\n");
			System.out.printf("│\t채널 : %d\t\t│\n", channel);
			if(zero!=0) {
				System.out.printf("│\t음소거되었습니다\t│\n", volume);
				System.out.printf("│\t음량 : %d\t\t│\n", volume);
			}else {
				System.out.printf("│                       │\n");
				System.out.printf("│\t음량 : %d\t\t│\n", volume);
			}
			System.out.printf("└───────────────────────┘\n");
			System.out.println();
		}else {
			System.out.printf("┌───────────────────────┐\n");
			System.out.printf("│                       │\n");
			System.out.printf("│                       │\n");
			System.out.printf("│                       │\n");
			System.out.printf("└───────────────────────┘\n");
		}
		
	}
	
	
	
	
	
	
	// 생성자에게 객체 생성 시 초기값을 지정하세요
	// 매개변수로 받지 않아도 초기값을 지정할 수 있습니다
	// 예를 들어 채널의 초기값이 0인 것은 이상합니다. 다른 초기값이 되도록 하세요
	
	TV() {
		power = false;
		channel = 1;
		volume = 10;
	}
}

public class Quiz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TV tv = new TV();
		int menu;
		
		LOOP : while(true) {
			System.out.println("1. 전원켜기/끄기");
			System.out.println("2. 채널올림");
			System.out.println("3. 채널내림");
			System.out.println("4. 볼륨올림");
			System.out.println("5. 볼륨내림");
			System.out.println("6. 음소거/음소거해제");
			System.out.print("선택 >>> ");
			menu = sc.nextInt();
			System.out.println();
			
			
			switch(menu) {
			// 입력된 메뉴에 따라서 tv객체의 메서드를 호출하는 형태로 진행
			case 0:
				break LOOP;
			case 1:
				tv.turn();
				tv.show();
				break;
			case 2:
				tv.channelUp();
				tv.show();
				break;
			case 3:
				tv.channelDown();
				tv.show();
				break;
			case 4:
				tv.volumeUp();
				tv.show();
				break;
			case 5:
				tv.volumeDown();
				tv.show();
				break;
			case 6:
				tv.mute();
				tv.show();
				break;
			}
			
		}
		sc.close();
		System.out.println("프로그램 종료");
		
	}// end of main
}// end of class
