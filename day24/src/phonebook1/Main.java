package phonebook1;

import java.util.List;
import java.util.Scanner;

public class Main {
	static PhonebookDTO getDTOFromUserInput(Scanner sc) {
		PhonebookDTO dto = new PhonebookDTO();
		
		System.out.print("이름 입력 : ");
		dto.setName(sc.nextLine());	// dto.name = sc.nextLine();
		
		System.out.print("전화번호 입력 : ");
		dto.setPnum(sc.nextLine());
		
		System.out.print("나이 입력 : ");
		dto.setAge(Integer.parseInt(sc.nextLine()));
		
		System.out.print("즐겨찾기 (Y/N) : ");
		dto.setFavorite(sc.nextLine());
		
		return dto;
	}
	
	public static void main(String[] args) throws Exception {
		Handler handler = new Handler();
		Scanner sc = new Scanner(System.in);
		int menu = -1;
		List<PhonebookDTO> list = null;
		PhonebookDTO ob = null;
		int row = 1;
		
		int idx;
		String name, pnum;
		
		LOOP : while(menu != 0) {
			System.out.println("메뉴를 선택해 주세요");
			System.out.println("1. 전체 목록");
			System.out.println("2. 내용 추가");
			System.out.println("3. 전화번호 수정");
			System.out.println("4. 즐겨찾기 수정");
			System.out.println("5. 내용 삭제");
			System.out.println("0. 종료");
			System.out.print("입력 >>> ");
			menu = Integer.parseInt(sc.nextLine());
			System.out.println();
			
			switch(menu) {
			case 1:	// 목록출력
				list = handler.selectList();
				list.forEach(System.out::println);
				System.out.println();
				break;
				
			case 2:	// 추가
				ob = getDTOFromUserInput(sc);
				row = handler.insertPhonebook(ob);
				System.out.println(row !=0 ? "추가 성공":"추가 실패");
				break;
				
			case 3:	// 전화번호 수정
				System.out.println("전화번호를 수정합니다");
				System.out.print("이름 입력 : ");
				name = sc.nextLine();
				System.out.print("변경할 전화번호 입력 : ");
				pnum = sc.nextLine();
//				row = handler.updatePnum(name, pnum);
				System.out.println(row != 0 ? "수정 성공" : "수정 실패");
				break;
				
			case 4:	// 즐겨찾기 수정
				break;
				
			case 5:	// 삭제
				break;
				
			case 0:	// 종료
				break LOOP;
			}
		} // end of while
		
		sc.close();
		System.out.println("프로그램이 종료되었습니다");
		
	} // end of main

} // end of class
