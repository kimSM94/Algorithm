import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
         Stack stack = new Stack();
        for (int i = 0; i < arr.length; i++) {

            if(i==0){
                stack.push(arr[i]);
            }

            if (arr[i] != Integer.parseInt(stack.peek().toString())) {
                stack.push(arr[i]);
            }

        }

        int[] answer = new int[stack.size()];

        // 스택의 요소를 배열로 복사
        for (int i = 0; i < stack.size(); i++) {
            answer[i] = (int) stack.get(i);
        }

        System.out.println(answer);
        return answer;
    }
}