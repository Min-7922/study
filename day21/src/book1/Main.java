package book1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 1번 출력
		// 2번 입력
		// 0번 종료
		
		// 변수 선언
		String name, author, publisher;			// Book의 String타입 필드 (입력받기 위한 값)
		int price;								// Book의 int타입 필드 (입력받기 위한 값)
		int menu = -1;							// switch와 연동하기 위한 메뉴
		
		Scanner sc = new Scanner(System.in);	// 입력받기 위한 Scanner
		Book[] arr = new Book[10];				// 여러 Book 객체를 저장하기 위한 배열
												// 배열은 자료형에 맞는 0값으로 초기화된다
												// 참조형 변수(클래스타입 변수)의 초기값은 null
		// arr = { null, null, null, null, null, null, null, null, null, null }; 
		
		// 입력 및 출력 (자료형 + 대입, 제어문 + 연산자 활용)
		LOOP : while(menu != 0) {
			// 사용자 메뉴 출력
			System.out.println("1번 출력");
			System.out.println("2번 입력");
			System.out.println("0번 종료");
			System.out.print("입력 >>> ");
			menu = Integer.parseInt(sc.nextLine());
			System.out.println();
			
			switch(menu) {	// 사용자가 입력한 메뉴에 따라서 서로 다른 코드를 수행한다 (분기문)
			case 1:	// 1. 전체 출력
				for(int i=0; i<arr.length; i++) {
					if(arr[i] != null) {	// 이 if문이 없을 시  null point Exception이 발생할 수 있다
											// 배열의 각 초기값을 null을 처리하기 위한 if
						System.out.println("=============================");
						System.out.println("책 제목 : " + arr[i].name);
						System.out.printf("가격 : %,d\n",arr[i].price);
						System.out.println("저자 : "+ arr[i].author);
						System.out.println("출판사 : " + arr[i].publisher);
					}
				}
				System.out.println("=============================");
				break;
				
			case 2:	// 2. 도서 추가
				
				System.out.print("도서명 입력 : ");
				name = sc.nextLine();
				System.out.print("가격 입력 : ");
				price = Integer.parseInt(sc.nextLine());
				System.out.print("저자 입력 : ");
				author = sc.nextLine();
				System.out.print("출판사 : ");
				publisher = sc.nextLine();
				System.out.println();
				
				// 4개의 값을 입력받았다면 하나의 객체로 구성하기 위해서 생성자를 호출한다
				// 배열의 10칸 중에서 빈칸을 하나 찾아서 거기에 객체를 생성하고 값을 넣어준다
				// 다음 칸에도 똑같은 값을 넣으면 안되니까 break를 수행해야 한다
				
				for(int i=0; i<arr.length; i++) {	// 배열의 처음부터 끝까지 순회하면서
					if(arr[i] == null) {			// 빈칸을 찾았다면
						arr[i] = new Book();		// 빈칸에 객체를 생성하고
						arr[i].name = name;			// Scanner로 입력받은 값을 객체의 속성으로 대입한다
						arr[i].price = price;		// 오른쪽의 파란색 - book의 멤버필드, 왼쪽의 갈색 - main의 지역변수
						arr[i].author = author;
						arr[i].publisher = publisher;
						break;	// 다음칸에 또 값을 넣으면 안되니까 break (반복 중단)
					}
				}
				break;	// 추가하고 나서 break가 없으면 case0으로 넘어가버리니까 switch의 break
				
			case 3:
				break LOOP;
				
			}// end of switch
			
		}// end of while
		System.out.println("종료되었습니다.");
		sc.close();
	}// end of main
}// end of class

//ctrl + shift + f --> 자동 정렬
