package book;

import java.util.Scanner;

// 사용자와 상호작용(입출력)
// 입력값에 따라서 handler의 함수를 호출

public class Main {
	public static void main(String[] args) {
		Handler handler = new Handler();
		Scanner sc = new Scanner(System.in);
		int menu;
		String name;
		int price;
		String publisher;
		String author;
		int yes;
		
		LOOP : while(true) {
			System.out.println("1. 책 입력");
			System.out.println("2. 책 목록 출력");
			System.out.println("0. 종료");
			System.out.print("선택 >> ");
			menu = Integer.parseInt(sc.nextLine());
			System.out.println();
			
			switch(menu) {
			case 1:
				// 책 제목 및 저자 입력
				System.out.print("목록에 저장하실 책 이름을 입력하세요 : ");
				name = sc.nextLine();
				System.out.print("목록에 저장하실 책 가격을 입력하세요 : ");
				price = Integer.parseInt(sc.nextLine());
				handler.input(name, price);
				if(!handler.inputCheck) break;
				
				// 출판사 입력 (선택)
				System.out.println("입력하신 책의 출판사를 입력하시려면 1번을 눌러주세요.");
				yes = Integer.parseInt(sc.nextLine());
				if(yes == 1) {
					System.out.print("출판사를 입력하세요 : ");
					publisher = sc.nextLine();
					handler.inputPublisher(name, publisher);
				}
				// 저자 입력 (선택)
				System.out.println("입력하신 책의 저자를 입력하시려면 1번을 눌러주세요.");
				yes = Integer.parseInt(sc.nextLine());
				if(yes == 1) {
					System.out.print("저자를 입력하세요 : ");
					author = sc.nextLine();
					handler.inputAuthor(name, author);
				}
				break;
			case 2:
				handler.show();
				break;
			case 0:
				sc.close();
				break LOOP;
			default :
				System.out.println("잘못된 입력입니다");
				break;
			}
			
		}// end of while
		
		System.out.println("프로그램 종료");
		
	}
}
