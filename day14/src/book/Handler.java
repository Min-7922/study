package book;

import java.util.Scanner;

// 1) 단일데이터의 배열
// 2) 데이터를 제어하기 위한 함수들

public class Handler {
	Book[] book = new Book[100];
	
	public void input(String name, int price) {	// 책의 제목과 가격을 넣는 함수
		for(int i=0; i<book.length; i++) {
			if(book[i] == null) {
				book[i].setName(name);
				book[i].setPrice(price);
			}
		}
	}
	
	public void show() {	// 검색결과 함수
		for(int i=0; i<book.length; i++) {
			if(book[i] != null) {
				System.out.println((i+1)+"번)" );
				System.out.println("책 제목 : " + book[i].getName());
				System.out.println("가격 : " + book[i].getPrice());
				if(book[i].getPublisher() != null) {
					System.out.println("출판사 : " + book[i].getPublisher());
				}
				if(book[i].getAuthor() != null) {
					System.out.println("저자 : " + book[i].getAuthor());
				}
			}
		}
	}
	
	
}
