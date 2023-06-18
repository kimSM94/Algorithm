import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            String gwalHo = br.readLine();
            Stack<Character> stack = new Stack<>();
            boolean result = true;

            for (int j = 0; j < gwalHo.length(); j++) {

                char ch = gwalHo.charAt(j);

                if(ch =='('){
                    stack.push(ch);
                }else if(ch ==')'){
                    if (stack.isEmpty()){
                        result = false;
                        break;
                    }
                    stack.pop();
                }
            }

            if (!stack.isEmpty()) {
                result = false;
            }

            if (result) {
                sb.append("YES");
            } else {
                sb.append("NO");
            }
            sb.append('\n');


        }
        System.out.println(sb);
    }

}
