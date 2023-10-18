package quiz;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		
		// 2의 배수 혹은 3의 배수 혹은 6의 배수를 각각 구분하여 출력하세요
		// 정수를 하나 입력받고, 위 3개 중 해당하는 하나만 출력하면 됩니다
		// 6의 배수를 입력받으면 2와 3의 배수에 모두 해당하지만 6의 배수만 출력해야 합니다
		
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 하나 입력하세요 : ");
		num = sc.nextInt();
		
		if(num % 2 == 0 || num % 3 == 0) {
			if(num % 2 == 0 && num % 3 == 0) {
				System.out.println("6의 배수입니다");
			}
			else if (num % 2 == 0) {
				System.out.println("2의 배수입니다");
			}
			else {
				System.out.println("3의 배수입니다");
			}
		}
		else {
			System.out.println("2, 3, 6의 배수가 아닙니다");
		}
		
		sc.close();
	}

}
