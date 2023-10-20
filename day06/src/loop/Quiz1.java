package loop;

public class Quiz1 {
	public static void main(String[] args) {
		
		// 1) 자신의 이름을 5회 반복하여 출력하세요
		
		String name = "황민정";
		int num = 0;
		
		while (num<5) {
			num++;
			System.out.println(name);
		}
		
		// 2) 0부터 5까지 한줄에 출력하세요
		
		num = 0;
		while (num<=5) {
			System.out.print(num + " ");
			num ++;
		}
		System.out.println();
		
		// 3) 5부터 0까지 한줄에 출력하세요
		
		num = 5;
		while (num<=5) {
			System.out.print(num + " ");
			num --;
			if (num == -1) break;
		}
		System.out.println();
		
		// 4) 1부터 100까지 합계를 구하여 출력하세요
		
		int sum = 0;
		for (int i=1; i<101; i++) {
			sum += i;
		}
		System.out.println("1부터 100까지 합 : " + sum);
		
		// 5) 1부터 100사이의 정수 중, 7의 배수만 한줄에 출력하세요
		
		num = 1;
		while (num<=100) {
			if (num % 7 == 0) {
				System.out.print(num + " ");
			}
			num ++;
		}
		
	
	}

}
