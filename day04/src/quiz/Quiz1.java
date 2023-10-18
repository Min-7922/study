package quiz;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// 두 정수를 입려받아서 더 큰 수를 화면에 출력
		
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		
		System.out.print("첫번째 정수를 입력하세요 : ");
		num1 = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println("더 큰수는 " + num1 + "입니다");
		}
		else if (num1 < num2) {
			System.out.println("더 큰수는 " + num2 + "입니다");
		}
		else {
			System.out.println("숫자가 같습니다");
		}
		
		sc.close();
		
	}

}
