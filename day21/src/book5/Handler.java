package book5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Handler {
	
	private ArrayList<Book> list = new ArrayList<>();
	
	// 파일 저장 및 불러오기 함수
	private File f = new File("BookList.csv");
	
	public Handler() {
		if (f.exists() == false ) {
			try {
				f.createNewFile();
				
			} catch (IOException e) {
				System.out.println("\t파일을 생성하는데에 문제가 발생했습니다 : " + e);
				e.printStackTrace();
			}
		}
	}
	
	// 저장
	public void save() {
		try {
			// 프로그램의 데이터를 파일로 내보내는 스트림 (데이터의 이동 통로)
			FileOutputStream fos = new FileOutputStream(f);
			
			// 스트림으로 문자열 형식 데이터를 전달하는 기능이 추가된 클래스
			OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
//			OutputStreamWriter osw = new OutputStreamWriter(fos);	// UTF-8안될때
			
			osw.write("/ufeff\n");
			
			for(Book ob : list) {
				String name = ob.getName();
				String author = ob.getAuthor();
				String publisher = ob.getPublisher();
				String price = String.valueOf(ob.getPrice());
				
				// 아래 서식은 띄어쓰기 없이 콤마로만 구분하기
				String data = String.format("%s,%s,%s,%s", name, price, author, publisher);
				osw.write(data);
				osw.write('\n');
			}
			osw.flush();
			osw.close();
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void load() {
		try {
			Scanner sc = new Scanner(f);
			String data = "";
			while(sc.hasNextLine()) {
				data = sc.nextLine();
				if(data.length() != 0) {
					String[] arr = data.split(",");
					Book b = new Book();
					b.setName(arr[0]);
					b.setPrice(Integer.parseInt(arr[1]));
					b.setAuthor(arr[2]);
					b.setPublisher(arr[2]);
					list.add(b);
				}
			}// end of while
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	} // end of load
	
	
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
