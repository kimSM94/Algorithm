import java.util.Arrays;
import java.util.Comparator;


class Solution {
               public int[] solution(int[] arr) {      if(arr.length==1){

                int[] answer ={-1};
                return answer;
            }else{
                int[] answer = new int[arr.length-1];

                Integer[] arr2 = Arrays.stream(arr).boxed().toArray(Integer[]::new);

                Arrays.sort(arr2, Comparator.reverseOrder());

                int min = arr2[answer.length];
                int index =0;
                for (int i = 0; i < arr2.length; i++) {
                    if (arr[i] == min) {
                        continue;
                    }
                    answer[index++] = arr[i];
                }

                return answer;

            }
        }
}