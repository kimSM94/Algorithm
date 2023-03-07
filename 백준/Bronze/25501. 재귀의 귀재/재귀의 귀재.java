import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int count = 0 ;

    static int recursion(String s,int l ,int r){


        if(l>=r){
            count++;
            return 1;
        }else if(s.charAt(l)!=s.charAt(r)){
            count++;
            return 0;
        }else{
            count++;
            return recursion(s, l + 1, r-1);
        }
    }

    static int isPalindrome(String s){
        return recursion(s, 0, s.length() - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            count = 0;
            sb.append(isPalindrome(br.readLine())).append(" ").append(count).append("\n");
        }
        System.out.println(sb);
    }
}
