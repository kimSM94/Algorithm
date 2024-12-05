class Solution {
    public int[] solution(String s) {
             int[] answer = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            // 현재 문자의 가장 최근 인덱스 찾기
            int lastIndex = s.lastIndexOf(s.charAt(i), i - 1);

            // 이전에 동일 문자가 없으면 -1, 있으면 거리 계산
            answer[i] = (lastIndex == -1) ? -1 : i - lastIndex;
        }



        return answer;
    }
}