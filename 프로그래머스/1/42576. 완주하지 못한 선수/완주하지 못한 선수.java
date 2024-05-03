import java.util.*;


class Solution {
    public String solution(String[] participant, String[] completion) {
           String answer = "";

        Map<String, Integer> result = new HashMap<>();

        for (String s : participant) {
            result.put(s, result.getOrDefault(s, 0) + 1);

        }


        for (String c : completion) {
            result.put(c, result.get(c) - 1);
        }

        for (String key : result.keySet()) {
            if (result.get(key) != 0) {
                answer = key;
                break;
            }
        }


        return answer;
    }
}