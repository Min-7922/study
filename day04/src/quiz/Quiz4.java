package quiz;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		// 지하철 1구간당 평균 소요 시간이 4분이라고 가정한다
		// 이동한 구간수를 입력받아서 이동하는데 걸린 시간을 출력하세요
		// 단, 이동한 시간이 60분 이하이면 분으로만 출력하고
		// 이동한 시간이 60분을 초과하면 시간과 분으로 나누어서 출력하세요
		
		
		Scanner sc = new Scanner(System.in);
		int station;
		int minute, hour;
		int perStation = 4;
		
		
		System.out.print("이동한 구간을 입력하세요 : ");
		station = sc.nextInt();
		
		minute = station * perStation;
		
		
		if (minute <= 60) {
			System.out.println("평균 소요 시간은 " + minute + "분 입니다.");
		}
		else {
			hour = minute/60;
			minute %= 60;
			
			System.out.printf("평균 소요 시간은 %d시간 %d분 입니다", hour, minute);
		}
		
		sc.close();
		
	}

}
