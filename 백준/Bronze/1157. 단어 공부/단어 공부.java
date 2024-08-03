
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine().toUpperCase();
        Map<Character, Integer> result = new HashMap<>();

        if (word.length() == 1) {
            System.out.println(word);
        }else{

            for(char list : word.toCharArray()){
                result.put(list, result.getOrDefault(list, 0) + 1);
            }

            int max =0;
            char result2 = '?';
            int count = 0;
            // HashMap의 모든 값을 출력
            for (Map.Entry<Character, Integer> entry : result.entrySet()) {
                Character key = entry.getKey();
                Integer value = entry.getValue();

                if (max < value) {
                    max = value;
                    result2 = key;
                }else if(max == value){
                    result2 = '?';
                }
            }

            System.out.println(result2);

        }




    }

}
