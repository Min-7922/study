package collection;

import java.util.Arrays;
import java.util.List;
// 원본, 제목 오름차순, 가격 내림차순 --> 출력
 
class Book implements Comparable<Book> {
	String name;
	int price;
	
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return String.format("%s : %,d원", name, price);
	}
	@Override
	public int compareTo(Book o) {
		return 0;
	}
}


public class Quiz1 {
	static void showList(List<Book> list) {
		for(Book b : list) {
//			System.out.printf("%s : %,d원\n", b.name, b.price);
			System.out.println(b);
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		Book[] arr = {
			new Book("전지적 푸바오 시점", 19800),
			new Book("더마인드", 17820),
			new Book("트렌드 코리아 2024", 17100),
			new Book("김대리의 데일리 뜨개", 18900),
			new Book("퓨처 셀프", 17820),
		};
		
		// 원본
		List<Book> list = Arrays.asList(arr);	// 배열을 리스트로 바꿔주는 함수
		showList(list);
		
		// 제목 오름차순
		list.sort((o1, o2) -> o1.name.compareTo(o2.name));
		showList(list);
		
		// 가격 내림차순
		list.sort((o1, o2) -> o2.price- o1.price);
		showList(list);
		
//		list.sort();	// ()내부에는 정렬의 기준을 설정하여 출력하도록 한다.
//		list.sort()함수는 내부에서 자신만의 방식으로 정렬을 수행한다
//		이때, 선택정렬 코드의 if 조건에 해당하는 부분만 만들어내는 함수가 compare 혹은 compareTo이다
//		if(arr[i] - arr[j] > 0) {...}
		
		list.sort((b1, b2) -> {
			int diff = b1.name.compareTo(b2.name);
			System.out.printf("[%s]와 [%s]를 비교한 차이값 : %d\n\n", b1.name, b2.name, diff);
			return diff;
		});
		
		
//		list.sort(null);
		// Book 클래스는 기본함수가 내장되어 있지 않기 때문에 예외가 발생한다
		// 기본 비교함수를 넣어주려면 인터페이스 Comparable을 구현하면 된다
		
		// Comparable : 클래스에서 implements 해서 사용하는 인터페이스
		// class Book implements Comparable { 비교가능한 도서 (compareTo를 오버라이딩한다) }
		
		// Comparator : 람다식으로 객체를 생성하여 전달할 때 사용한다
		// 비교함수가 없거나, 자신만의 기준으로 비교하고 싶을 때 만들어서 전달한다
		
		list.sort(null);
		showList(list);

		
		
		
		
	} // end of main

}
