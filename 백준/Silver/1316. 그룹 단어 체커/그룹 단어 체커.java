
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());
        int sum = number;
        for (int i = 0; i < number; i++) {
            String word = br.readLine();

            boolean[] check = new boolean[26];
            boolean isGroupWord = true;

            for (int j = 0; j < word.length(); j++) {
                char currentChar = word.charAt(j);
                if (j > 0 && currentChar != word.charAt(j - 1)) {

                    if (check[currentChar - 'a']) {
                        isGroupWord = false;
                        break;
                    }
                }
                check[currentChar - 'a'] = true;
            }

            if (!isGroupWord) {
                sum--;
            }

        }


        System.out.println(sum);
    }

}
