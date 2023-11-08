package book;

import java.util.Scanner;

// 1) 단일데이터의 배열
// 2) 데이터를 제어하기 위한 함수들

public class Handler {
	Book[] book = new Book[100];
	boolean inputCheck;
	
	public boolean check(String name) {	// 중복된 책의 제목이 있는지 체크하는 함수
		int count = 0;
		boolean answer = true;
		
		for(int i=0; i<book.length; i++) {
			if(book[i] != null) {
				if(book[i].getName().equals(name)) count +=1;
			}
		}// end of for
		
		if(count>1) {
			
			answer = false;
		}
			
		return answer;
	}
	
	
	
	
	public void input(String name, int price) {	// 책의 제목과 가격을 넣는 함수
		inputCheck = true;
		for(int i=0; i<book.length; i++) {
			if(book[i] == null) {
				book[i] = new Book(name,price);
				break;
			}
		}
		
		if(!check(name)) {	
			System.out.println("이미 존재하는 책입니다. 다시 입력해주세요.");
			inputCheck = false;
			
			for(int i=book.length-1; i>=0; i--) {
				if(book[i]!=null) {
					if(book[i].getName().equals(name)) {
						book[i]=null;
						break;
					}
				}
			}
		}// end of check if
		
	}
	

	
	
	public void inputPublisher(String name,String publisher) {	// 출판사를 넣는 함수
		for(int i=0; i<book.length; i++) {
			if(book[i]!=null) {
				if(book[i].getName()==name) {
					book[i].setPubliser(publisher);
				}
			}
		}
	}
	
	public void inputAuthor(String name,String author) {	// 저자를 넣는 함수
		for(int i=0; i<book.length; i++) {
			if(book[i]!=null) {
				if(book[i].getName()==name) {
					book[i].setAuthor(author);
				}
			}
		}
	}
	
	
	
	public void show() {	// 목록출력 함수
		for(int i=0; i<book.length; i++) {
			if(book[i] != null) {
				System.out.println("=======================");
				System.out.println((i+1)+"번)" );
				System.out.println("책 제목 : " + book[i].getName());
				System.out.printf("가격 : %,d\n",book[i].getPrice());
				if(book[i].getPublisher() != null) {
					System.out.println("출판사 : " + book[i].getPublisher());
				}
				if(book[i].getAuthor() != null) {
					System.out.println("저자 : " + book[i].getAuthor());
				}
				
			}
		}
		System.out.println("=======================");
		System.out.println();
	}
	
	
}// end of class
