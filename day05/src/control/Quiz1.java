package control;

import java.util.Random;

public class Quiz1 {
	public static void main(String[] args) {
		// 게시글 데이터의 총 개수가 주어지면
		// 여러 게시글을 총 몇개의 페이지로 나누어서 불러와야 할지 계산하여 출력하세요
		// - 페이지 당 게시글 출력 개수는 10개이다.
		// - 하나의 게시글이라도 생략되면 안된다
		// - 총 게시글 수는 10000 ~ 99999
		// - 요청으로 읽어들여야 할 게시글의 페이지 번호가 제시된다
		// - 출력으로 불러와야 할 게시글의 번호를 n번부터 n + 10 까지 가져와야 한다.
		
		Random ran = new Random();
		int boardCount = ran.nextInt(89999) + 10000;
		int pageCount = 1;	// 수정되어야함
		int page;			// 아래에서 페이지 랜덤으로 받을 예정
		int begin = 0, end = 0;	// 게시글 번호의 처음과 끝
		

		// 총 페이지의 개수
		if (boardCount%10 == 0)	pageCount = boardCount/10;		// 게시글이 10의 배수일 때 페이지수
		else 					pageCount = boardCount/10 + 1;	// 게시글이 10의 배수가 아닐 때 페이지수

		page = ran.nextInt(pageCount) + 1;
		
		// 페이지의 첫번째 게시글과 마지막 게시글 번호
		begin = (page * 10) - 9;
		
		if (page != pageCount)	end = (page * 10);	// 마지막 페이지일 경우
		else 					end = boardCount;	// 마지막 페이지가 아닐 경우
		
		
		
		System.out.println("총 게시글의 개수 : " + boardCount);
		System.out.println("요청받은 페이지 : " + page);
		System.out.printf("%d개의 게시글에서 %d페이지를 요청받았으므로, \n", boardCount, page);
		System.out.printf("%d번부터 %d번 게시글을 불러와서 출력하면된다.\n", begin, end);
	}

}
