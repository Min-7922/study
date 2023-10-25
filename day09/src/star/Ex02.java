package star;

public class Ex02 {
	public static void main(String[] args) {
		// 횟수를 제어할 변수를 미리 만들어두고 내가 직접 횟수를 변경/제어하기
		
		int size = 5;
		int sp = size/2;
		int st = 1;
		// 다이아
		for(int i=0; i<size; i++) {	// 5줄
			// 공백
			for(int j=0; j<sp; j++) {	
				System.out.print("  ");
			}
			// 별
			for(int j=0; j<st; j++) {	
				System.out.print("# ");
			}
			// 공백
			for(int j=0; j<sp; j++) {	
				System.out.print("  ");
			}
			// 한줄이 끝나면 줄바꾸기
			System.out.println();
			
			
			if(i<size/2) {	// 전체 줄 중에서 가운데 도달하지 못했다면(윗부분)
				sp -= 1;
				st += 2;
			}
			else {	// 가운데 줄이거나 아랫쪽이면
				sp += 1;
				st -= 2;
			}
			
		}
		System.out.println();
		System.out.println();
		
		
		int space = 0;
		int star = 5;
		// 역삼각형
		for(int i=0; i<5; i++) {
			for(int j=0; j<space; j++) {
				System.out.print("  ");
			}
			for(int j=0; j<star; j++) {
				System.out.print("# ");
			}
			
			System.out.println();
			space++;
			star--;
		}
		System.out.println();
		
		
		space = 0;
		star = 5;
		// 모래시계
		for(int i=0; i<5; i++) {
			for(int j=0; j<space; j++) {
				System.out.print("  ");
			}
			for(int j=0; j<star; j++) {
				System.out.print("# ");
			}
			for(int j=0; j<space; j++) {
				System.out.print("  ");
			}
			
			if(i<5/2) {
				space++;
				star-=2;
			}
			else {
				space--;
				star+=2;
			}
			System.out.println();
		}
		
		System.out.println();
		
		size = 13;
		star = 1;
		space = size-star*2;
		
		// 나비
		System.out.println();
		System.out.println();
		
		for(int i=0; i<size; i++) {
			
			for(int j=0; j<star; j++) {
				System.out.print("# ");
			}
			for(int j=0; j<space; j++) {
				System.out.print("  ");
			}
			for(int j=0; j<star; j++) {
				if(i==(size/2) && j==(size/2))  break;
				// if( i==size/2 && j==0 ) { j++; }
				// 가운데줄 이면서 j반복의 첫번째에서만 j를 한번더 증가(j를 2씩 증가)
				System.out.print("# ");
			}
			
			System.out.println();
			
			if(i<size/2) {
				space-=2;
				star++;
			}
			else {
				space+=2;
				star--;
			}
		}
		
		
		
		
		
		
		
		
	}

}
