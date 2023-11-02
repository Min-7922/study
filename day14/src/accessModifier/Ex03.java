package accessModifier;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Human[] arr = new Human[5];
		// = { null, null, null, null, null } 
		// -> Human타입 객체를 5개 받을 자리를 마련한것이다. 안에 객체가 생성되어있지는 않음
		Scanner sc = new Scanner(System.in);
		
		
		// 5번 입력받아서 객체 생성하고 배열에 넣기
		for(int i=0; i<arr.length; i++) {
			// arr[i]는 처음에는 빈칸(null)이기 떄문에 객체를 먼저 만들어야 한다
			arr[i] = new Human();
			
			// 이름과 나이를 변수에 입력받고, 입력받은 값을 setter를 활용하여 객체에 넣는다
			System.out.print("이름 입력 : ");
			String name = sc.next();
			System.out.print("나이 입력 : ");
			int age = sc.nextInt();
			arr[i].setName(name);	// setter
			arr[i].setAge(age);		// setter
		}
		System.out.println("== 입력 완료 ==");
		System.out.println("== 출력 시작 ==");
		
		// 배열의 내용 출력하기
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != null) {	// i번째 칸이 빈칸이 아니면
									// arr에는 Human타입의 데이터만 들어갈 수 있으므로
									// 빈칸이 아니면, Human타입의 객체가 있다는 이야기이다.
				System.out.printf("%s : %d살\n", arr[i].getName(), arr[i].getAge());
				//									getter				getter
			}
		}
		System.out.println("== 출력 완료 ==");
		
		
		sc.close();
	}

}
