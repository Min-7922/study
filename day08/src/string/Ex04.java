package string;

public class Ex04 {
	public static void main(String[] args) {
		String[] arr = { "짱구", "맹구", "유리", "훈이", "수지", "철수", "짱아" };
		String s2 = "";
		String search = "짱";	// sc.next(); -> 사용자가 입력한 내용이 포함된 것을 출력하게 할 수 있음
		
		for(int i=0; i<arr.length; i++) {	// 전체 데이터 중에서
			String name = arr[i];			// 각 개별 데이터를 name이라고 할 때
			if(name.contains(search)) {		// search에 있는 글자가 포함되면
//				System.out.println(name);	// 출력한다
				s2 += name + "\n";			// 이름과 줄바꿈문자를 더한다
			}
		}
		System.out.println(s2);
		
	}

}
