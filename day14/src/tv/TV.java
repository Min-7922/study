package tv;

public class TV {
	
	// 필드
	boolean power;
	int channel;
	int volume;
	int maxCh = 15;
	int minCh = 1;
	int minVl = 0;
	int maxVl = 10;
	int saveVl;
	
	// 생성자
	TV() {
		power = false;
		channel = 5;
		volume = 3;
	}
	
	// 메서드
	void turn() {
		power = !power;
	}
	
	// 채널 올림	: 채널은 최대값을 넘기면 최소값으로 변해야 한다
	void ChannelUp() {				
		if(power) {					// 전원이 켜져있으면 
			channel++;				// 채널을 올린다
			if(channel > maxCh) {	// 채널이 최대값보다 커지면
				channel = minCh;	// 채널을 최소값으로 바꿔준다
			}
		}
		show();
	}
	
	// 채널 내림	: 채널은 최소값을 넘기면 최대값으로 변해야 한다
	void channelDown() {
		if(power) {
			channel--;
			if(channel < minCh) {
				channel = maxCh;
			}
		}
		show();
	}
	
	// 볼륨 올림	: 볼륨은 최대값을 넘기면 최대값으로 변해야 한다
	void volumeUp() {
		if(power) {
			volume++;
			if(volume > maxVl) {
				volume = maxVl;
			}
		}
		show();
	}
	
	// 볼륨 내림	: 볼륨은 최소값을 넘기면 최소값으로 변해야 한다
	void volumeDown() {
		if(power) {
			volume--;
			if(volume < minVl) {
				volume = minVl;
			}
		}
		show();
	}
	
	// 음소거		: 마지막으로 저장된 볼륨값을 복사해두었다가, 다시 불러와야 한다 
	void mute() {
		if(power) {
			int tmp = volume;
			volume = saveVl;
			saveVl = tmp;
		}
		show();
	}
	
	// 화면 출력	: 현재 TV의 채널과 볼륨상태를 보여줄 수 있어야 한다
	void show() {
		System.out.printf("┌───────────────────────┐\n");
		System.out.printf("│\t채널 : %d\t\t│\n", channel);
		System.out.printf("│\t음량 : %d\t\t│\n", volume);
		System.out.printf("└───────────────────────┘\n");
	}

}
