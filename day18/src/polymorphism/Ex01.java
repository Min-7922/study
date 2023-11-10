package polymorphism;

class Animal {	// 공통 기능과 속성은 슈퍼클래스에
	String name;
	
	Animal(String name) {
		this.name = name;
	}
	
	// 서로 다른 동물(강아지, 고양이)의 공통점을 파악해보자
	// 다리가 4개, 꼬리가 있다, 털이 있다, 울음소리를 낸다
	
	void bark() {
		System.out.println(name + " : ...");
	}
}

class Dog extends Animal {	// 오버라이딩 및 개별 고유 기능은 서브클래스에
	Dog(String name) {
		super(name);
	}
	
	@Override			// 슈퍼클래스의 공통 기능을 상속받은 후 내용을 재정의함 (서브클래스마다 달라지는 내용)
	void bark() {
		System.out.println(name + " : 멍멍");
	}
	void tailing() {	// 다른 Animal에서는 없는 Dog만의 고유기능 (Dog가 아니면 동작하지 않는다)
		System.out.println(name + "가 꼬리를 흔든다");
	}
}

class Cat extends Animal {	// 오버라이딩 및 개별 고유 기능은 서브클래스에
	Cat(String name) {
		super(name);
	}
	
	@Override
	void bark() {
		System.out.println(name + " : 야옹");
	}
	
	void play() {	// play()는 고양이의 고유 기능 (다른 동물은 실행할 수 없음)
		System.out.println(name + "가 혼자서 잘 논다");
	}
	
}

public class Ex01 {
	public static void main(String[] args) {
		Cat ob1 = new Cat("해피");
		Dog ob2 = new Dog("뽀삐");
		
		ob1.bark();
		ob2.bark();
		
		ob1.play();
		ob2.tailing();
		
		// 상속 관계는 카테고리(범주)상 포함관계일 때 사용할 수 있으며
		// A is B 관계가 성립해야 한다
		// 강아지(Dog)는 동물(Animal)이다 (O)
		// 고양이(Cat)는 동물(Animal)이다 (O)
		// 올바른 상속관계라면, A를 B로 치환해서 사용할 수 있어야 한다
		
		Animal a1 = ob1;	// 고양이
		Animal a2 = ob2;	// 강아지
		
		System.out.println(a1 == ob1);
		System.out.println(a2 == ob2);
		
		// 각각 동일한 대상을 참조하고 있다
		System.out.println(a1);
		System.out.println(ob1);	
		System.out.println();
		System.out.println(a2);
		System.out.println(ob2);
		
		// a1과 ob1은 서로 동일한 대상을 참조하고 있다
		// 다만, a1의 자료형은 Animal이고 ob1의 자료형은 Cat이다
		// a1으로 참조하면 Animal클래스에 작성된 내용만 참조할 수 있고
		// ob1으로 참조하면 Cat클래스에 작성된 내용까지 모두 참조할 수 있다
		
//		a1.play();		// Animal 클래스에는 play() 메서드가 없다 (Cat의 고유기능)
//		a2.tailing();	// Animal 클래스에는 tailing() 메서드가 없다 (Dog의 고유기능)
		
		// 중요!!!!
		a1.bark();	// 슈퍼클래스 Animal에는 bark()가 <name + " : ...">으로 정의되어 있지만
		a2.bark();	// 각 서브클래스의 오버라이딩 내용으로 실행된다
		System.out.println();
		
		// upcasting : 서브클래스의 객체를 슈퍼클래스로 참조하는 형태 (자료형 변환) 
		
//		Animal[] arr = { a1, a2 };
		Animal[] arr = { ob1, ob2 };	// 배열에 담으면서 자료형이 자연스럽게 바뀐다 (dog,cat --> Animal)
		
		
		for(int i=0; i<arr.length; i++) {	// Object 클래스의 getClass()
			String className = arr[i].getClass().getSimpleName(); // 클래스이름을 문자열로 반환하는 코드
			System.out.println("arr[i]의 클래스 이름 : "+arr[i].getClass().getSimpleName());
//			arr[i].play();		// Cat의 고유메서드 (실행 안됨)
//			arr[i].tailing();	// Dog의 고유메서드 (실행 안됨)
			arr[i].bark();		// Animal의 공통메서드 (실행 가능, 내용은 각자 다름)
			
			switch(className) {
			case "Cat":
				Cat tmp1 = (Cat) arr[i];	// 강제 형변환, downcasting
				tmp1.play();
				break;
			case "Dog":
				Dog tmp2 = (Dog) arr[i];
				tmp2.tailing();
				break;
			}
			
			// 업캐스팅 된 객체를 원래대로 돌리기 위해 다운캐스팅을 해야한다 -> 이를 위해 확인작업이 필요함 (위처럼 switch를 이용 또는 아래처럼 instanceof를 사용할 수 있다)
			if(arr[i] instanceof Cat) {	// 객체 instanceof 클래스
				Cat tmp1 = (Cat) arr[i];
				tmp1.play();
			}
			if(arr[i] instanceof Dog) {	// 지정한 객체가 클래스에 의해 생성된 객체인가 확인하는 연산자
				Dog tmp2 = (Dog) arr[i];
				tmp2.tailing();
			}
		}
		
		
		
		
	}

}








