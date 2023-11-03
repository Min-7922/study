package accessModifier;

class Message {
	
	private String name;
	// 같은 클래스를 사용하는 서로 다른 객체라면
	// private이더라도 필드 값에 직접 접근할 수 있다

	public Message(String name) {
		this.name = name;
	}
	
	void sendmessage(Message other, String message) {	
		// 받는 사람의 receieveMessage를 호출한다
		// 이때 전달하는 this는 sendMessage를 호출했던 자기자신이다
		// 따라서 this의 자료형은 Message 이다
		other.receieveMessage(this, message);	// 여기서 this는 sendmessage함수를 호출하는 자기자신
	}
	
	void receieveMessage(Message sender, String message) {
//		System.out.printf("===%s의 화면===\n", this.name);
		System.out.printf("%s : %s\n", sender.name, message);	// sender가 아닌 sender.name으로 한 이유 -> sender만 하면 객체의 주소가 출력됨
		
	}
}


public class Ex02 {
	public static void main(String[] args) {
		Message ob1 = new Message("짱구");
		Message ob2 = new Message("유리");
		
		ob1.sendmessage(ob2, "유리야 안녕");			// 짱구->유리 "유리야 안녕"
													// 짱구(ob1) :  sendMessage의 주체
													// 유리(ob2) :  receieveMessage의 주체
										
		ob2.sendmessage(ob1, "안녕 짱구야, 소꿉놀이 하러 갈래?");	// 유리->짱구 "안녕 짱구야, 소꿉놀이 하러 갈래?"
															// 유리(ob1) :  sendMessage의 주체
															// 짱구(ob2) :  receieveMessage의 주체
		
	}
}
