package control;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
/*
		놀이공원에 있는 놀이기구에 대한 이용요금 계산
		이 놀이기구는 탑승하면 기본 3000원 요금
		이용 시간에 따라 추가 요금 발생
		
		시간			요금
		0 ~ 30		3000	
		31 ~ 40		3500	1~9,10	1	500
		41 ~ 50 	4000	2~19,20	2	1000
		51 ~ 60		4500	3~30,30	3	1500
		61 ~ 70		5000
		...
		
		시간을 분으로 입력받아서, 요금을 출력하는 프로그램을 작성하세요
*/
		
		int fee = 3000;	// 기본요금
		int total_fee;	// 총 요금
		int time;		// 입력받을 이용시간
		
		Scanner sc = new Scanner(System.in);
		
		time = sc.nextInt();
		
		if (time<=30) total_fee = fee;	// 시간이 30분 이하일 때 기본요금
		else {							// 시간이 30분을 초과할 때 기본요금 + 10분당 500
			
			if (time%10 == 0){
				total_fee=((time-30)/10) * 500 + fee;
			}
			else {
				total_fee = ((time-30)/10+1) * 500 + fee;
			}
		}
		
		System.out.printf("이용시간 : %,d분 \n",time);
		System.out.printf("요금은 %d원 입니다", total_fee);
		
		sc.close();
	}
}
