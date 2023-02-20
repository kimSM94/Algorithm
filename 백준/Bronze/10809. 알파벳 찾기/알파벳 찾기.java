
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();

        StringBuilder sb = new StringBuilder();
        for(char c = 'a'; c<='z';c++){
            sb.append(S.indexOf(c) + " ");
        }
        System.out.println(sb);

    }


}
