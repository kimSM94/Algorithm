class Solution {
    public int[] solution(int brown, int yellow) {
       int[] answer = new int[2];

		for (int i = 1; i * i <= yellow; i++) {
            if (yellow % i == 0) {
                answer[0] = yellow / i + 2; //가로가 세로보다 커야 하므로
                answer[1] = i + 2;
                if (answer[0] * answer[1] -  yellow == brown)
                    return (answer);
            }
        }

		return answer;
    }
}