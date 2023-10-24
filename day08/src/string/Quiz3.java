package string;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
/*
 	16자리의 카드번호를 문자열로 입력받아서
 	카드번호의 오른쪽끝에서 부터 세어서
 	홀수번째는 그대로 두고
 	짝수번째는 2를 곱한다
 	만약 2를 곱한 숫자가 두자리수이면
 	각 자리수를 더해서 한자리 수로 만든다
 	이렇게 만들어진 16개의 한자리 숫자를 모두 더하여
 	그 합이 10으로 나누어 떨어지면 유효한 카드번호
 	그렇지 않으면 유효하지 않은 카드번호이다
 	(Luhn 알고리즘)
 	
 	카드번호를 입력받아서 유효성을 검증하는 코드를 작성하세요
 */
	Scanner sc = new Scanner(System.in);
	System.out.print("카드번호 입력 (xxxx-xxxx-xxxx-xxxx) : ");
	String input = sc.next();
	int arr[] = new int[input.length()];
	
	input = input.replace("-", "");
	
	for(int i=0; i<input.length(); i++) {
		arr[i]=input.charAt(i);
		if(i%2==0) {
			
		}
	}
	
	
		
		
		
		
	}

}
