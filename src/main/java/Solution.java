
import java.util.*;

class Solution {
    // [Lv.1 프로그래머스] 개인정보 수집 유효기간
    public int[] solution(String today, String[] terms, String[] privacies) {

        List<Integer> anwser = new ArrayList<>();
        Map<String, Integer> termMap = new HashMap<>();
        int date = getDate(today);

        for (String s : terms)
        {
            String[] term = s.split(" ");
            termMap.put(term[0], Integer.parseInt(term[1]));
        }

        for(int i = 0; i<privacies.length;i++){
            String[] privacy = privacies[i].split(" ");

            if(getDate(privacy[0]) +(termMap.get(privacy[1]) * 28) <=date){
                anwser.add(i + 1);
            }
        }
        // stream() -> 자바 8. 람다식으로 처리할 수 있게 처리
        // mapToInt
        return anwser.stream().mapToInt(integer -> integer).toArray();
    }


    private int getDate(String today){
        String[] date = today.split("\\.");
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);
        return (year * 12 * 28) + (month * 28) + day;
    }

}

