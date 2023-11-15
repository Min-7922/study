package book4;

import java.util.ArrayList;

// 데이터 저장소(배열 -> 리스트 -> 파일 -> DB)를 직접 참조하거나, 연결할 수 있음
// 프로그램의 주요 기능(목록/추가/삭제 등)을 모아둔 클래스

public class Handler {
	
//	private Book[] arr = new Book[10];	// ↓ 리스트로 전환됨
	// 배열에서 리스트로 전환 (배열의 자료형은 리스트의 제네릭 타입이 된다)
	private ArrayList<Book> list = new ArrayList<>();
	
	// 도서 추가
	public void showList() {	// 1~4) 모두 동일한 내용을 출력하는 서로 다른 방법!
		// 1) index를 사용하는 for문
//		for (int i = 0; i < list.size(); i++) {
//			Book ob = list.get(i);
//			System.out.println(ob);
//		}	
//		
//		// 2) 향상된 for문(index를 사용하지 않음)
//		for(Book ob : list) {
//			System.out.println(ob);
//		}
//		
		// 3) 람다식 + 컬렉션 forEach()
		list.forEach(ob -> System.out.println(ob));
		
//		// 4) 메서드 참조
//		list.forEach(System.out::println);
		
	}// end of showList
	
	
	// 도서 추가
	public int insertBook(Book ob) {
		int row = 0;
		boolean flag = list.add(ob);	// 추가 성공하면 true가 반환된다
		row = flag ? 1 : 0;				// true이면 row가 1, 아니면 row가 0
		
		return row;
	}// end of insertBook
	
	
	// 도서 삭제
	public int deleteBook(String name){
		int row = 0;
		
		// 조건에 맞는 요소를 삭제하는 리스트의 함수 (반환값은 boolean 타입)
		boolean flag = list.removeIf(ob -> ob.getName().equals(name));
		// 도서명이 같은 도서들은 모두 삭제가 되므로 중복되지않은 고유의 키값이 필요하다.
		// 키값이 있으면 삭제를 했을 때 내가 원하는 객체를 골라서 삭제가 가능하다.
		row = flag ? 1 : 0;
		
		return row;
	}// end of deleteBook
	
}
