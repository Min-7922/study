package loop;

import java.util.Random;
import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int answer = ran.nextInt(100) + 1;	// 1~100 랜덤값
		int user;
		int count = 0;
		
		
		// 반복을 수행하면서 
		//		사용자에게 값을 입력받고
		// 		만약 정답이 입력값보다 작으면 DOWN
		//		    정답이 입력값보다 크면 UP
		//			일치하면 반복을 중단
		//		반복할 때마다 횟수를 증가시키기
		
		// 반복이 끝나면 정답과 횟수를 출력하고 종료
		
		
		while(true) {	// 횟수를 알 수 없기때문에 무한반복으로 설정하고 내부에서 break로 중단하기
			count ++;	// 반복할떄마다 횟수 증가
			
			// 사용자에게 입력값 받기
			System.out.print("1 ~ 100 중에서 정수 하나를 입력하세요 : ");
			user = sc.nextInt();
			
			if(user==answer) {		// 정답이 맞으면 반복 종료
				System.out.printf("드디어 정답을 맞췄습니다!!^^ : %d\n시도횟수 : %d",answer,count);
				break;
			}
			else if (user>answer) {	// 정답보다 입력값이 크면 UP
				System.out.println("Down");
			}
			else {					// 정답보다 입력값이 작으면 DOWN
				System.out.println("Up");
			}
		}
		sc.close();
	}

}
