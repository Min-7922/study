package accessModifier;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// Human 클래스를 이용하여 비어있는 상태의 객체를 하나 생성하세요
		
		Scanner sc = new Scanner(System.in);
		Human ob;
		ob = new Human();
		
		// 본인의 이름과 나이를 키보드로 입력하여 그 값을 ob에 저장하고
		// 한줄에 출력하세요
		
		System.out.print("이름 입력 : ");
		ob.setName(sc.nextLine());
		
		System.out.print("나이 입력 : ");
		ob.setAge(sc.nextInt());
		
		System.out.println("이름 : " +ob.getName() + "   |   나이 : " + ob.getAge());
		
		
		sc.close();
	}

}
