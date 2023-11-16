package book6;

import java.util.Scanner;

public class Main {
	
	
	// case2의 입력부분, Scanner를 매개변수로 전달받아서 객체를 생성하고, 그 객체를 반환하는 함수
	// 입력을 받기 때문에 Handler 클래스를 만들어도 이 부분은 따로 가져가지 않는다
	static BookDTO getBookFromUserInput(Scanner sc) {
		// 사용자 입력값으로 객체를 구성하여 그 객체를 반환하는 함수
		BookDTO book = new BookDTO();
		String name, author, publisher;	
		int price;
		
		System.out.print("도서명 입력 : ");
		name = sc.nextLine();

		System.out.print("저자 입력 : ");
		author = sc.nextLine();
		System.out.print("출판사 : ");
		publisher = sc.nextLine();
		System.out.print("가격 입력 : ");
		price = Integer.parseInt(sc.nextLine());
		System.out.println();
		
		book.setName(name);
		book.setPrice(price);
		book.setAuthor(author);
		book.setPublisher(publisher);
		
		return book;
	}
	

	
	public static void main(String[] args) {
		// 변수 선언
		Handler handler = new Handler();
		BookDTO book = null;						
		String name;
//		String author, publisher;			
//		int price;								
		int menu = -1;							
		int row = 0;	// 추가 및 삭제가 정상적으로 수행되었는지 확인하기 위한 변수
		
		Scanner sc = new Scanner(System.in);	
//		Book[] arr = new Book[10];				
		
		// 입력 및 출력
		while(menu != 0) {
			// 사용자 메뉴 출력
			System.out.println("1번 목록 출력");
			System.out.println("2번 도서 입력");
			System.out.println("3번 도서 삭제");
			System.out.println("0번 종료");
			System.out.print("입력 >>> ");
			menu = Integer.parseInt(sc.nextLine());
			System.out.println();
			
			switch(menu) {	
			case 1:	// 1. 전체 출력
				handler.showList();
				System.out.println();
				break;
				
			case 2:	// 2. 도서 추가
				book = getBookFromUserInput(sc);	// 이미 값이 모두 세팅된 객체를 받는다
				row = handler.insertBook(book);
				System.out.println((row !=0 ? "추가 성공" : "추가 실패"));
				break;
			
			case 3:
				// 배열 내부의 도서 중에서 이름이 일치하는 객체를 찾아서 제거한다
				System.out.print("검색어를 입력하세요 : ");
				name = sc.nextLine();
				row = handler.deleteBook(name);
				System.out.println((row !=0 ? "삭제 성공" : "삭제 실패"));
				break;
				
			case 0:	// 종료하기 전에 저장하고 종료한다
				System.out.println("프로그램이 종료되었습니다.");
				
			}// end of switch
			
		}// end of while
		
		sc.close();
		
	}// end of main
}// end of class


