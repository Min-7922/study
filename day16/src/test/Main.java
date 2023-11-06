package test;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StudentFunction sf = new StudentFunction();
		String name;
		int ban, no;
		int kor, eng, math;
		
		while(true) {
			System.out.print("이름을 입력하세요 : ");
			name = sc.nextLine();
			System.out.print("반을 입력하세요 : ");
			ban = Integer.parseInt(sc.nextLine());
			System.out.print("번호를 입력하세요 : ");
			no = Integer.parseInt(sc.nextLine());
			System.out.print("국어 점수를 입력하세요 : ");
			kor = Integer.parseInt(sc.nextLine());
			System.out.print("영어 점수를 입력하세요 : ");
			eng = Integer.parseInt(sc.nextLine());
			System.out.print("수학 점수를 입력하세요 : ");
			math = Integer.parseInt(sc.nextLine());
			Student st = new Student(name, ban, no, kor, eng, math);
			sf.input(st);
			System.out.println();
			System.out.print("계속 입력하시려면 1번, 종료는 다른 숫자를 눌러주세요 : ");
			int num = Integer.parseInt(sc.nextLine());
			System.out.println();
			if(num==1) continue;
			else break;
		}
		
		// 학생 평균점수 오름차순으로 출력하기
		sf.arrByScore();
		sf.show();
		
		
	}
	

}
