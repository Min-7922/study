package quiz;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		
		// 이름과 나이를 입력받고
		// 나이를 이용하여 성인 여부를 문자열로 준비한다음
		// 이름, 나이, 성인여부를 한 문장에 출력하는 코드를 작성하세요
		// 단, 성인은 20세 이상
		
		// 1) 변수 선언 및 초기화
		String name;
		int age;
		boolean isAdult;
		
		Scanner sc = new Scanner(System.in);
		
		// 2) 입력
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine();
		
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		
		// 3) 연산
		isAdult = age > 19;
		
		// 4) 출력
		System.out.printf("이름 : %s\n나이 : %d살\n%s입니다", name, age, isAdult ? "성인" : "미성년자");
		
		// 5) 마무리
		sc.close();
	}

}
