package loop;

public class Ex06 {
	public static void main(String[] args) {
		// 30일동안 은행에 돈을 입금한다
		// 첫날에 10원 그 다음날에 20원, 다음날에 40원 ..
		// 이런식으로 전날의 두배를 준비하여 입금한다
		// 30일째에 입금이 끝난 후 
		// 은행에 누적된 총 금액은?
		// (금액에 천단위 구분기호 콤마를 적용하여 출력하라)
		
		long account = 0L;
		long money = 10L;
		
		for(int i=0; i<30; i++) {
			account =account+money;
			money *= 2;	// money = money *2
		}
		
		System.out.printf("총 잔액은 %,d원 입니다\n",account);
														
	}

}
