package loop;

public class Ex03 {
	public static void main(String[] args) {
		// for문 기본 연습 문제
		
		// 1) 1에서 10사이 정수의 합계를 구하여 출력
		
		int sum1 = 0;
		for(int i=1; i<11; i++) {
			sum1 += i;
		}
		System.out.println("1~10 합계 : " + sum1);
		
		
		// 2) 11에서 20 사이 정수의 합계 출력
		
		int sum2 = 10;
		for (int i=1; i<11; i++) {
			sum2 += i;
		}
		System.out.println("11~20 합계 : " + sum2);
		
		
		// 3) 5에서 0까지 세로로 출력
		
		for (int i=0; i<6; i++) {
			int num = 5;
			num -= i;
			System.out.println(num);
		}
	}

}
