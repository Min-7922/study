package function;

import java.util.Random;
import java.util.Scanner;

public class Ex01 {
	// 1~6 사이의 랜덤 정수를 반환하는 함수
	// 매개변수 없이도 함수를 만들 수 있다.
	static int getDice() {	// 사용자 함수에서는 자주 사용되거나, 복잡한 코드를 묶어둔다
		
		Random ran = new Random();
		int dice = 0;
		dice = ran.nextInt(6)+1;
		return dice;
	}
	
	
	
	public static void main(String[] args) {	// 전체 프로그램의 진행을 작성
		Scanner sc = new Scanner(System.in);	// 메인함수의 코드만 보고도 대략 어떤 흐름인지 파악할 수 있다
//		Random ran = new Random();
		// 위 getDice함수에도 ran이 있지만 서로 지역이 달라서 문제되지 않는다
		// = 지역변수 특징
		
		int answer;
		int user;
		int cnt = 0;
		
		while(true) {
			answer = getDice();
			System.out.print("주사위 값을 맞춰 보세요 : ");
			user = sc.nextInt();
			cnt++;
			if(answer == user) {
				break;
			}
			
		}
		System.out.printf("정답입니다. %d회만에 정답을 맞췄습니다\n", cnt);
	}

}








