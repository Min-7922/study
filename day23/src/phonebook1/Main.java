package phonebook1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Handler handler = new Handler();
		Scanner sc = new Scanner(System.in);
		int menu = -1;
		String name = null;
		String pnum = null;
		int age = 0;
		String fav = null;
		
		LOOP : while(menu != 0) {
			System.out.println("메뉴 출력");
			System.out.println("1. 전체 목록");
			System.out.println("2. 추가");
			System.out.println("3. 전화번호 수정");
			System.out.println("4. 즐겨찾기 수정");
			System.out.println("5. 삭제");
			System.out.println("0. 종료");
			System.out.println("입력 >>> ");
			menu = Integer.parseInt(sc.nextLine());
			System.out.println();
			
			switch(menu) {
			case 1: // 테이블 전체 목록 출력
				handler.showlist();
				break;
				
			case 2:	// 추가
				System.out.println("<내용 추가>");
				System.out.print("이름 : ");
				name = sc.nextLine();
				System.out.print("전화번호 : ");
				pnum = sc.nextLine();
				System.out.print("나이 : ");
				age = Integer.parseInt(sc.nextLine());
				System.out.print("즐겨찾기 (Y/N) : ");
				fav = sc.nextLine();
				
				handler.insert(name, pnum, age, fav);
				break;
				
			case 3:	// 전화번호 수정
				System.out.print("번호를 변경할 이름을 입력하세요 : ");
				name = sc.nextLine();
				System.out.print("변경할 번호를 입력하세요 : ");
				pnum = sc.nextLine();
				handler.updatePnum(name, pnum);
				break;
				
			case 4:	// 즐겨찾기 수정
				System.out.print("즐겨찾기를 변경할 이름을 입력하세요 : ");
				name = sc.nextLine();
				handler.updateFav(name);
				break;
				
			case 5:	// 삭제
				System.out.print("삭제할 내용의 이름을 입력하세요 : ");
				name = sc.nextLine();
				handler.delete(name);
				break;
			case 0:
				break LOOP;
			}
		}// end of while
		
		sc.close();
		System.out.println("프로그램 종료");
		
	} // end of main

} // end of class
