package string;
// 2021 카카오 블라인드

class Solution {
	public String solution(String new_id) {
//		1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.(0)
		new_id = new_id.toLowerCase();
		String id = "";
		
		
//		2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거(0)		
		for(int i=0; i<new_id.length(); i++) {
			char ch = new_id.charAt(i);
			if('a'<=ch && ch<='z' || ch == '-' || ch =='_' || ch=='.' || '0'<=ch && ch<='9') {
				 id += ch;
			}
		}
		
		
//		3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다. (0)
		while(id.contains("..")) {
			id = id.replace("..", ".");
		}
		
		
//		4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.(0)
		while(id.startsWith(".")) {
			id = id.substring(1);
			
		}
		while(id.endsWith(".")) {
			id = id.substring(0,id.length()-1);
		}
		
//		5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.(0)
		
		if ("".equals(id)) {	// 리터럴과 변수의 비교는 리터럴을 앞에 세우는 것이 좋다.
			id = "a";			// .연산자 앞에 null이 오면 안되기때문
		}
		
		
//		6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
//	     만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.(0)
		
		if(id.length()>=16) {
			id = id.substring(0,15);
		}
		while(id.endsWith(".")) {
			id = id.substring(0,id.length()-1);
		}
		
		
//		7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
		;
		
		while(id.length()<=2) {
			String str = id.substring(id.length()-1);
			id += str;
		}
		
		
//		System.out.println("test : " +id);
		String answer = id;
		return answer;	// 함수가 종료되면서 마지막에 반환하는 값
	}
}

public class Quiz2 {
	public static void main(String[] args) {
		String[] inputs = {	// 사용자입력 아이디
			"...!@BaT#*..y.abcdefghijklm",
			"z-+.^.",
			"=.=",
			"123_.def",
			"abcdefghijklmn.p"
		};
		String[] outputs = {	// 추천아이디
			"bat.y.abcdefghi",
			"z--",
			"aaa",
			"123_.def",
			"abcdefghijklmn"
		};
		
		Solution solution = new Solution();
		for(int i=0; i<inputs.length; i++) {
			String new_id = inputs[i];	// 사용자입력 아이디 배열의 i번째 값 -> new_id
			String output = outputs[i];	// 추천아이디 배열의 i번째 값 -> output
			String answer = solution.solution(new_id);	// new_id를 solution클래스를 이용하여 이를 answer로 만들었을때 
			System.out.printf("%d) %s\n", i +1, answer.equals(output));	// 추천아이디와 답이 일치하는지 확인
		}
		System.out.println("테스트 끝");
		
	}

}
