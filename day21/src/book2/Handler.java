package book2;

// 데이터 저장소(배열 -> 리스트 -> 파일 -> DB)를 직접 참조하거나, 연결할 수 있음
// 프로그램의 주요 기능(목록/추가/삭제 등)을 모아둔 클래스

public class Handler {
	
	private Book[] arr = new Book[10];
	
	// 배열을 전달받아서, 배열 내부의 각 객체를 서식에 맞게 출력하는 함수
	public void showList() {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) { // 이 if문이 없을 시 null point Exception이 발생할 수 있다
									// 배열의 각 초기값을 null을 처리하기 위한 if
				System.out.println("=============================");
				System.out.println("책 제목 : " + arr[i].getName());
				System.out.printf("가격 : %,d\n", arr[i].getPrice());
				System.out.println("저자 : " + arr[i].getAuthor());
				System.out.println("출판사 : " + arr[i].getPublisher());
			}
		}
		System.out.println("=============================");
	}// end of showList
	
	// 도서 추가
	public int insertBook(Book ob) {
		int row = 0;
		for(int i=0; i<arr.length; i++) {	
			if(arr[i] == null) {			
				arr[i] = ob;
				break;	
			}
		}
		return row;
	}// end of insertBook
	
	// 도서 이름을 전달받아서, 배열 안에서 일치하는 객체를 찾아서 삭제하는 함수
	public int deleteBook(String name){
		int row = 0;
		for (int i=0; i<arr.length; i++) {
			// '.'을 찍는 순간 NullPointerException이 생긴다 ( ex> .getName())
			// 이 예외를 방지하기 위해 arr[i] != null 이라는 조건식도 붙여줘야 한다
			if(arr[i] != null && arr[i].getName().equals(name)) {
				arr[i] = null;	// 참조변수가 객체를 참조하지 않도록 한다
								// 모두에게서 잊혀진 참조변수는 소멸한다
				row = 1;		// 삭제했다는 결과를 반환하기 위해 row값을 1로 설정한다
				break;			// 하나를 지웠으면 반복 중단
			}
		}
		return row;
	}// end of deleteBook
	
}
