package control;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// 여러 케이스에 대응되는 하나의 수식 만들기
		
		Scanner sc = new Scanner(System.in);
		int num;
		String gender="";
		
		System.out.print("주민등록번호 7번째 자리 입력 : ");
		num = sc.nextInt();
		
		switch(num) {
		case 9: case 1: case 3:		// if(num == 9 || num == 1 | num == 3 )
			System.out.println("남성입니다");
			gender = "남성";
			break;
			
		case 0:
		case 2:
		case 4:
			System.out.println("여성입니다");
			gender = "여성";
			//break;	// 마지막 줄은 break를 생략해도 된다
						// 반드시 default를 작성할 필요는 없다
						// default는 if문의 마지막 else에 해당한다
		}
		System.out.println("gender : " + gender);
		sc.close();
	}

}
