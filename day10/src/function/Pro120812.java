package function;

// 주어진 배열에서 가장 등장빈도가 많은 값을 구하세요
// 가장 많이 등장한 값의 횟수가 아니라 값 그자체를 반환해야 한다
// 최빈값이 2개 이상이면 -1반환해야 한다

// 0<array의 길이<100
// 0<array의 원소<1000


class Solution {
	public int solution(int[] array) {
		int answer = 0;
		
		// 원소의 최대값을 먼저 구하고, 그 길이만큼 배열을 생성하여 횟수체크에 사용한다
		// 이 과정을 생략하고 싶다면 길이 1001의 배열을 생성하면 된다
		// +1이 들어가는 이유는 0부터 시작하는 index특성상 계산이 번거로워져서
		
		int[] counts = new int[1001];
		int max = counts[0];
		int count = 0;
		
		for(int i=0; i<counts.length; i++) {	// counts배열에 각 순서번호와 동일한 array배열에 같은 숫자가 있다면
			for(int j=0; j<array.length; j++) { // 총 수량을 카운트하여 집어넣는다
				if(array[j]==i) {
					counts[i] += 1;
				}
			}
			if(counts[i]>max) {					// 이때 counts배열에서 가장 큰 숫자를 max로 지정한다
				max = counts[i];
			}
		}
		for(int i=0; i<counts.length; i++) {	// max가 된 칸의 순번이 최빈값이므로 answer에 담고
			if(counts[i]==max) {				// max가 여러개 있을 시 count를 올린다
				count += 1;
				answer = i;
			}
		}
		if(count >1) {							// count(최빈값의 수량이 1보다 클 때) answer -> -1
			answer = -1;
		}
		
			
		// 최빈값을 answer에 담아서 반환하면 된다
		// 1) array에서 가장 많이 등장한 값을 찾아야 한다
		// 2) array의 각 값이 등장한 횟수를 체크해야 한다
		// 횟수에서 최대값을 찾아서, 횟수가 아닌 가장 많이 등장한 값을 answer에 담는다
		// 만약 횟수에서 최대값이 중복된다면 answer에 -1을 담는다
		
		return answer;
	}
}

public class Pro120812 {
	public static void main(String[] args) {
		
		Solution s = new Solution();
		int answer1 = s.solution(new int[] {1,2,3,3,3,4});
		int answer2 = s.solution(new int[] {1,1,2,2});
		int answer3 = s.solution(new int[] {1});
		int answer4 = s.solution(new int[] {5,6,6,6,6,6,7,7,7,7,8,8,8,8});
		System.out.println(answer1);
		System.out.println(answer2);
		System.out.println(answer3);
		System.out.println(answer4);
	}

}
