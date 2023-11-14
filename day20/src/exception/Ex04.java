package exception;

import java.util.Scanner;

public class Ex04 {
	
	static int getDivide(int n1, int n2) throws ArithmeticException{ // 전가시킬 때에는 throws를 적고 해당하는 예외 이름을 적는다	
											// callee : 호출당하는 함수 (알바생)
											// employee
		return n1/n2;
	}	// n2가 0이었을 때 예외 발생 (그 외의 정수를 넣으면 정상적으로 작동)
		// 예외 발생시 이 getDivide 함수만의 책임이 아닌 main에도 책임이 있다
	
	
	public static void main(String[] args) { // caller : 다른 함수를 호출하는 함수 (사장님)
											 // employer
		// 예외 전가 (throws)
		// callee에서 발생한 예외를 caller에게 전가시킨다
		
		int n1, n2, answer;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 2개 입력 : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
//		answer = getDivide(n1, n2);
		
		try {
			answer = getDivide(n1, n2);
			System.out.printf("%d / %d = %d\n", n1, n2, answer);
		} catch(ArithmeticException e) {
			System.out.println("숫자를 0으로 나눌 수 없습니다");
			answer = 0;
		}
		
		
		sc.close();
	}

}
