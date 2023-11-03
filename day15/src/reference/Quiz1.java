package reference;

import java.util.Arrays;

class Member {
	// private 멤버 필드
	private String name;
	private int age;
	
	// 필드를 사용하는 생성자 ( 저장 -> 우클릭 -> s, o -> 엔터 )
	public Member(String name, int age) {	// 생성자
		this.name = name;
		this.age = age;
	}
	
	// public getter/setter ( 저장 -> 우클릭 -> s, r -> alt+a, alt+r )
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void show() {
		System.out.printf("%s : %d살\n", name, age);
	}
	
	
} // class of Member

public class Quiz1 {
	public static void main(String[] args) {
		Member[] arr = new Member[] {
			new Member("원빈", 45),	
			new Member("현빈", 41),	
			new Member("우빈", 34),	
			new Member("준빈", 31),
			new Member("다빈", 29)
		};
		
		for (int i=0; i<arr.length; i++) {
			arr[i].show();
		} System.out.println();
		
		// 이름을 기준으로 arr를 오름차순하는 함수를 만들어서 정렬을 수행하고 출력하기
		// 비교는 객체의 이름을 기준으로 하고, 자리변경은 객체를 교환한다 (객체의 이름과 나이는 한 세트이므로)
		System.out.println("<<이름 오름차순>>");
		sortMemberArrayByName(arr);
		for(int i=0; i<arr.length; i++) {
			arr[i].show();
		}
		System.out.println();
		// 나이를 기준으로 arr를 오름차순하는 함수를 만들어서 정렬을 수행하고 출력하기
		// 비교는 객체의 나이를 기준으로 하고, 자리변경은 객체를 교환한다 (객체의 이름과 나이는 한 세트이므로)
		System.out.println("<<나이 오름차순>>");
		sortMemberArrayByAge(arr);
		for(int i=0; i<arr.length; i++) {
			arr[i].show();
		}
		
	} // end of main
	
	static void sortMemberArrayByName(Member[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				// 멤버끼리는 비교가 안된다
				// 객체 그 자체 대신, 객체의 이름을 꺼내와서 비교해야 한다
				String iName = arr[i].getName();
				String jName = arr[j].getName();
				
				if(iName.compareTo(jName)>0) {	// i이름과 j의 이름비교시 i가 더 크다면 객체를 바꿔야함
					Member tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
	}
	
	
	static void sortMemberArrayByAge(Member[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				int iAge = arr[i].getAge();
				int jAge = arr[j].getAge();
				if(iAge>jAge) {
					Member tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	
	

} // end of class Quiz1
