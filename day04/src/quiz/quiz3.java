package quiz;

import java.util.Scanner;

public class quiz3 {
	public static void main(String[] args) {
		// 서로 다른 세 정수를 입력받은 다음 가장 큰 수를 하나 출력하세요
		
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3;
		int max;	//가장 큰 수 저장
		
		
		System.out.print("1번 정수 입력 : ");
		num1 = sc.nextInt();
		System.out.print("2번 정수 입력 : ");
		num2 = sc.nextInt();
		System.out.print("3번 정수 입력 : ");
		num3 = sc.nextInt();
		
		
//		if (num1 >= num2 && num1 >= num3) { 		// num1이 가장 클 때
//			System.out.println("가장 큰 수는 " + num1 + "입니다.");
//		}
//		else if (num2 >= num1 && num2 >= num3) {	// num2가 가장 클 때
//			System.out.println("가장 큰 수는 " + num2 + "입니다.");
//		}
//		else if (num3 >= num1 && num3 >= num2) {	// num3이 가장 클 때
//			System.out.println("가장 큰 수는 " + num3 + "입니다.");
//		}
		// 비효율적...
		
		
		if (true) 		max = num1;
		if (max < num2) max = num2;
		if (max < num3)	max = num3;
		// 위 코드를 반복문으로 처리하면 효율적이다.
		
		System.out.println("가장 큰 수는 " + max + "입니다.");
		
		
		sc.close();
		

		
	}

}
