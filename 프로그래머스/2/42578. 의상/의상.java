import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
         int answer = 1;

        Map<String, Integer> result = new HashMap<>();

        // 의상 종류별로 의상 수를 센다
        for (String[] cloth : clothes) {
            String kind = cloth[1];
            result.put(kind, result.getOrDefault(kind, 0) + 1);
        }

        for (int count : result.values()) {
            answer *= (count + 1);
        }

        // 아무것도 입지 않는 경우를 하나 뺀다
        return answer - 1;

    }
}