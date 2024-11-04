import java.util.Arrays;
class Solution {
    public String solution(String s) {
         char[] wordArray = s.toCharArray();
        Arrays.sort(wordArray);
        StringBuilder sb = new StringBuilder();
        for (int i = wordArray.length; i > 0; i--) {
            sb.append(wordArray[i - 1]).append("");
        }
        return sb.toString();
    }
}