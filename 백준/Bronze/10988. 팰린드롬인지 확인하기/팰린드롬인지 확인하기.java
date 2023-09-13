import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

   
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine().toLowerCase();
        int result = 1;
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length()-1-i)) {
                result = 0;
                break;
            }else{
                result = 1;
            }
        }
        br.close();

        System.out.print(result);
    }
}
