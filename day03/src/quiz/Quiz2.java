package quiz;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		// 친구와 고기집에 갔다 (2명)
		// 이 식당에서는 첫 주문에 최소 3인분을 주문해야하고
		// 이후에는 1인분씩 추가가 가능하다
		// 돼지고기 삼겹살 1인분이 8500원이고
		// 소주1병(4500원), 맥주1병(5000원)을 고정으로 주문했다
		// 추가 주문한 삼겹살의 양을 받아서	<- 여기가 입력받아야 할 값
		// 총 결제해야 할 금액을 계산하고
		// 더치페이로 1인당 얼마를 내야 하는지 계산하여 출력하는 프로그램을 작성하세요
		
		
		int add;
		int num;
		int total, dutchPay;
		int meat = 8500;
		int soju = 4500;
		int beer = 5000;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("삼겹살 추가주문 수량을 입력하세요 : ");
		add = sc.nextInt();
		System.out.print("인원을 입력하세요 : ");
		num = sc.nextInt();
		
		
		total = (meat*3) + (soju*1) + (beer*1);
		total += meat * add;
		dutchPay = total/num;
		
		
		System.out.printf("기본 3인분 %,d원, 소주 1병 %,d원, 맥주 1병 %,d원, 추가주문 %,d인분 %,d원\n", meat*3, soju, beer, add, add*meat);
		System.out.printf("총 금액은 %,d원, 1인당 %,d원 입니다", total, dutchPay);
		
		
		sc.close();
		
		
	}

}
