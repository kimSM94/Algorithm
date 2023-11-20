import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < num; i++) {

            String word = br.readLine().toUpperCase().trim();
            if(word.length()==1){
                sb.append(word.charAt(0)).append(word.charAt(0)).append("\n");

            }else{
                sb.append(word.charAt(0)).append(word.charAt(word.length()-1)).append("\n");

            }

        }
        System.out.print(sb);

    }

}
