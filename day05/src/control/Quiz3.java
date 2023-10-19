package control;

import java.util.Scanner;


// 이클립스 디버깅하기
// 1) 중단점을 설정한다 (ctrl + shift + b) or 줄번호 왼쪽 클릭
// 2) F11을 눌러서 디버깅을 시작한다(화면 구성을 바꿀건지 물어보면 yes)
// 3) F6을 누를때 마다 한줄씩 실행되고 우측에서 변수 값을 확인할 수 있다

public class Quiz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		int num1;
		int num2;
		String gender = "";
		int birth_d;
		int birth_m;
		int birth_y;
		
		int gender_num;
		
		System.out.println("주민등록번호 13자리 입력 (xxxxxx-yyyyyyy)");
		System.out.print("입력 : ");
		input = sc.next();
		
		num1 = Integer.parseInt(input.split("-")[0]);
		num2 = Integer.parseInt(input.split("-")[1]);
		
		
		
		gender_num = (num2/1000000);	// 주민등록번호 뒷자리 첫 글자
		
		birth_y = num1 / 10000;				
		birth_m = (num1 / 100) % 100;			
		birth_d = num1 % 100;				// 0의 개수만큼 오른쪽 숫자를 가져온다
		
		//System.out.println(birth_y);
		//System.out.println(birth_m);
		//System.out.println(birth_d);
		
		
		switch(gender_num) {
		case 1: 
			gender = "남성";
			birth_y += 1900;
			break;
		case 3:
			gender = "남성";
			birth_y += 2000;
			break;
		case 2: 
			gender = "여성";
			birth_y += 1900;
			break;
		case 4:
			gender = "여성";
			birth_y += 2000;
		}
			
		
		//System.out.println("num1 : " + num1);
		//System.out.println("num2 : " + num2);
		System.out.println();
		
		System.out.printf("출생일은 %d-%02d-%02d 입니다\n", birth_y, birth_m, birth_d);
		System.out.println("성별 : " + gender);
		
		
		
		
		// 4자리의 출생연도, 2자리의 출생월, 2자리의 출생일
		// 그리고 성별은 문자열로 준비하여 모두 출력하세요
	}

}
