package function;

import java.util.Scanner;

//이름과 생년월일을 입력받아서
// 이름, 올해나이, 생일을 (yyyy-mm-dd) 형식으로 출력하는 코드를 작성하기

public class Ex02_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		String birth; int year; int month; int date;
		int age;
		String result;
		boolean isNum = true;
		
		
		
		System.out.print("이름 입력 : ");	// 이름입력
		name = sc.nextLine();
		
		while(true) {
			System.out.print("생년월일 입력 (yymmdd) : ");	// 생년월일 입력
			birth = sc.nextLine();
			
			char[] arr = new char[birth.length()];
			for(int i=0; i<birth.length(); i++) {	// birth -> 배열에 char형태로 집어넣기
				arr[i] = birth.charAt(i);
				if(('0'<=arr[i] && arr[i]<='9')== false) {	// 배열 값이 숫자인지 아닌지 확인
					isNum=false;							// 숫자가 아니면 즉시 반복 멈추고 isNum = false
					break;
				}
			}
			if(birth.length()==6 && isNum==true) break;	// birth의 길이가 6이면서 isNum이 true이면 반복문 중단
			
			System.out.println("생년월일은 6자리 정수로 입력해주세요");
		}
		
		
		year = Integer.parseInt(birth.substring(0, 2));
		month = Integer.parseInt(birth.substring(2, 4));
		date = Integer.parseInt(birth.substring(4));
		
		year += (23<year) ? 1900:2000;
		age = 2023 - year;
		
		String form = "%s님은 %d살이고, %4d-%02d-%02d 출생입니다";
		result = String.format(form,name,age,year,month,date);
		
		System.out.println(result);
		
		sc.close();
		
	}

}
