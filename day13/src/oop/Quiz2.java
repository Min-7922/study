package oop;

// 편의점에서 성인/미성년자 여부에 따라 상품을 판매하려고 합니다
// 손님 클래스는 이름과 나이로 구성되어 있습니다

class Customer {
	// 1) 문자열 형태의 이름과 정수 형태의 나이를 저장할 수 있는 필드를 작성하세요
	String name;
	int age;
	
	// 2) 손님 객체는 반드시 이름과 나이가 지정되어 있어야 합니다
	// 생성자를 활용해 매개변수로 이름과 나이를 전달받은 후 필드에 저장하도록 작성하세요
	Customer(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 3) 손님의 간략한 정보를 확인하기 위한 void show() 함수를 작성하세요
	// printf를 이용하여 이름과 나이를 한 줄에 출력하면 됩니다.
	void show() {
		System.out.printf("이름 : %s, 나이 : %d\n", name, age);
	}
	
	// 4) 손님이 성인인지 아닌지 판별하기 위한 isAdult()를 작성합니다
	boolean isAdult() {
		boolean answer;
		answer = age>=20;
		return answer;
	}
	
	// 7) 생성자를 추가로 작성하여(오버로딩), 이름만으로도 객체를 생성할 수 있도록 한다
	// 이때, 값을 초기화하지 않은 age의 값은 0
	Customer(String name) {
		this.name = name;
	}
}

public class Quiz2 {
	public static void main(String[] args) {
		// 5) 성인 2명, 미성년자 1명 총 3개의 손님 객체 생성
		// 이름과 나이는 자유롭게 지정하면 됩니다
		Customer ob1 = new Customer("홍길동", 24);
		Customer ob2 = new Customer("김영희", 15);
		Customer ob3 = new Customer("박철수", 20);
		Customer ob4 = new Customer("둘리");
		
		// 6) 손님객체 3명을 배열로 묶은 다음
		// 반복문을 이요하여 손님의 성인 여부에 따라 판매가능/불가능을 출력합니다
		Customer[] arr = {ob1, ob2, ob3, ob4};
		for(int i=0; i<arr.length; i++) {	
			Customer member = arr[i];		// 배열 안의 각 손님 객체를 member
			member.show();					// 손님 정보 출력
			if(member.isAdult()) {			// 손님이 성인일 경우
				System.out.println("상품 판매 가능");
			}
			else {							// 손님이 미성년자일 경우
				System.out.println("상품 판매 불가능");
			}
			System.out.println();	// 구분을 위해 한줄 바꾸기
		}
		
		
	} // end of main()

}
