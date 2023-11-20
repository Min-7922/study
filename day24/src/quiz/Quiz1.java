package quiz;

import java.util.Random;
import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, answer, user;
		
		n1 = ran.nextInt(10) + 1; 		// 1~10
		n2 = ran.nextInt(10) + 1; 		// 1~10
		answer = n1 + n2;	// 랜덤 숫자 n1 + n2
		System.out.printf("%d + %d = ", n1, n2);
		
		
		user = sc.nextInt();	// 유저가 넣은 답
		
		boolean flag = isCorrect(answer, user);
		System.out.println(flag ? "정답" : "오답");
		sc.close();
		
	}
	
	static boolean isCorrect(int answer, int user) {
		return answer == user;
	}

}
