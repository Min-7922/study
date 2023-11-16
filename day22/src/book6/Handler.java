package book6;

import java.util.List;

public class Handler {
	
	// 배열에서 리스트로 전환 (배열의 자료형은 리스트의 제네릭 타입이 된다)
	// 리스트에서 파일을 거쳐서 DB로 저장소를 변경한다
	
	// 전체 목록 출력
	public void showList() {	
		BookDAO dao = new BookDAO();
		List<BookDTO> list = dao.selectList();
		list.forEach(ob -> System.out.print(ob));
		
	}
	
	// 도서 추가
	public int insertBook(BookDTO ob) {
		int row = 0;
		BookDAO dao = new BookDAO();
		row = dao.insertBook(ob);	// 메인이 넘겨준 객체를 dao로 전달하여 추가한다
		return row;					// 추가 결과 : 정수를 다시 메인으로 반환한다
	}// end of insertBook
	
	
	// 도서 이름을 전달받아서, 배열 안에서 일치하는 객체를 찾아서 삭제하는 함수
	public int deleteBook(String name){
		int row = 0;
		BookDAO dao = new BookDAO();
		row = dao.deleteBook(name);
		return row;
	}// end of deleteBook
	
}
