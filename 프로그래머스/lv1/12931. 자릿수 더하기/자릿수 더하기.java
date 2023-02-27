import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        String p = String.valueOf(n);
        
        for(int i = 0; i< p.length(); i++){
           answer+=p.charAt(i)-'0';           
        }
        
        return answer;
    }
}