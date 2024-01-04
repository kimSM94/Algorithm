import java.util.Arrays;

class Solution {
	/*
	 * 무인도에 갇힌 사람은 1명 이상 50,000명 이하입니다. 각 사람의 몸무게는 40kg 이상 240kg 이하입니다. 구명보트의 무게 제한은
	 * 40kg 이상 240kg 이하입니다. 구명보트의 무게 제한은 항상 사람들의 몸무게 중 최댓값보다 크게 주어지므로 사람들을 구출할 수 없는
	 * 경우는 없습니다.
	 */
	int[] people;
	int limit;
	int answer;

	public int solution(int[] people, int limit) {
		this.people = people; // [70, 50, 80, 50]
		this.limit = limit; // 100
		answer = 0;
		Arrays.sort(people);

		int index = 0;
		System.out.println("people.length  >>"  + people.length );
		for (int i = people.length - 1; i >= index; i--) {
			if(people[i]+people[index]<=limit) {
				index++;
				answer++;
			}
			else {
				answer++;
			}
		}

		
		return answer;
	}
	
	
	public static void main(String[] args) {
		Solution main = new Solution();
		int result = main.solution(new int[] {70,50,80,50}, 100);
		
		System.out.println("result >> "+result);
		
	}

}