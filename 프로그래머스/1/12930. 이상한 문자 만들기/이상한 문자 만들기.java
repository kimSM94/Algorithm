class Solution {
    public String solution(String s) {
      StringBuilder sb = new StringBuilder();

        String[] words = s.split(" ", -1); // 공백도 유지하면서 단어 분리

        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (i % 2 == 0) {
                    sb.append(Character.toUpperCase(c));
                } else {
                    sb.append(Character.toLowerCase(c));
                }
            }
            sb.append(" "); // 단어 끝에 공백 추가
        }

        // 마지막 공백 제거 후 반환
        return sb.substring(0, sb.length() - 1);
    }
}