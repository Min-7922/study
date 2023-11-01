package oop;

class Circle {
	double radius;
	double area;
	double pi = 3.14;	// 필드에 초기값을 지정해두면, 생성자로 덮어쓰지 않는한
						// 모든 객체가 동일한 값을 가진다
	
	// 반지름 radius를 전달받아서 저장하고
	// 원의 넓이를 구하는 코드를 포함하는 생성자를 작성하세요
	Circle(int radius) {
		this.radius = radius;
		area = pi * radius * radius;
	}
	
	// 생성자를 오버로딩하여 정수 혹은 실수 형태로 전달받을 수 있도록 처리하세요
	Circle(double radius) {
		this.radius = radius;
		area = pi * radius * radius;
	}
	
	// 원의 반지름과 넓이를 각각 출력하는 show() 함수를 정의하세요
	void show() {
		System.out.printf("원의 반지름 : %.1f\n",radius);
		System.out.printf("원의 넓이 : %.2f\n",area);
		System.out.println();
	}
}

public class Quiz1 {
	public static void main(String[] args) {
		Circle ob1 = new Circle(2);
		Circle ob2 = new Circle(3.2);
		
		ob1.show();
		ob2.show();
	}

}
