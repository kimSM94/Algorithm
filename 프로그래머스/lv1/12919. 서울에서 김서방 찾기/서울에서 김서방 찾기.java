class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int count = 0;
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                count = i;
            }
        }

        answer = "김서방은 " + count + "에 있다";

        return answer;
    }
}