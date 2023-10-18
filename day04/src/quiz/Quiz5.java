package quiz;

import java.util.Random;
import java.util.Scanner;


public class Quiz5 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		int eleA, eleB, eleC;
		int floor;
		int distance1, distance2, distance3;
		Scanner sc = new Scanner(System.in);
		
		eleA = ran.nextInt(15) + 1;	// 1~15
		eleB = ran.nextInt(15) + 1; // 1~15
		eleC = ran.nextInt(15) + 1; // 1~15
		
		System.out.printf("%d, %d, %d\n", eleA, eleB, eleC);
		
		// 현재 자신의 위치를 1~15 사이로 입력한 다음
		// 가장 가까운 엘리베이터가 몇번째인지 출력하는 코드를 작성하세요
		// (가장 가깝다 = 거리값이 최소이다 = 차이의 절대값이 최소값이다)
		
		
		System.out.print("현재 층을 입력하세요 : ");
		floor = sc.nextInt();
		
		
		if (floor>=eleA) {
			distance1 = floor - eleA;
		}
		else {
			distance1 = eleA - floor;
		}
		
		
		if(floor>=eleB) {
			distance2 = floor - eleB;
		}
		else {
			distance2 = eleB - floor;
		}
		
		
		if(floor>=eleC) {
			distance3 = floor - eleC;
		}
		else {
			distance3 = eleC - floor;
		}
		
		
		if (distance1<=distance2 && distance1<=distance3) {
			if (distance1==distance2 && distance1==distance3) {
				System.out.println("모든 엘리베이터가 같은 층에 있습니다");
			}
			else if(distance1==distance2) {
				System.out.println("가장 가까운 층은 첫 번째와 두 번째 엘리베이터 입니다");
			}
			else if(distance1==distance3) {
				System.out.println("가장 가까운 층은 첫 번째와 세 번째 엘리베이터 입니다");
			}
			else {
				System.out.println("가장 가까운 층은 첫 번째 엘리베이터 입니다");
			}
			
			System.out.println("첫 번째 엘리베이터가 이동합니다");
		}
		else if (distance2<=distance1 && distance2<=distance3) {
			if(distance2 == distance3) {
				System.out.println("가장 가까운 층은 두 번째와 세 번째 엘리베이터 입니다");
			}
			else {
				System.out.println("가장 가까운 층은 두 번째 엘리베이터 입니다");
			}
			System.out.println("두 번째 엘리베이터가 이동합니다");
		}
		else {
			System.out.println("가장 가까운 층은 세 번째 엘리베이터 입니다");
			System.out.println("세 번째 엘리베이터가 이동합니다");
		}
		
	
		sc.close();

		
		
		
		
	}

}
