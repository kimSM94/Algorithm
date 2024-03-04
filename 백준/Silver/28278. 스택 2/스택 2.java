import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            while (st.hasMoreTokens()) {
                int num2 = Integer.parseInt(st.nextToken());

                if(num2 == 1){
                    stack.add(Integer.parseInt(st.nextToken()));
                }


               else if (num2 == 2) {
                    if (!stack.empty()) {
                        sb.append(stack.pop()).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }

                } else if (num2 == 3) {
                    sb.append(stack.size()).append("\n");
                } else if (num2 == 4) {
                    if (stack.empty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }

                } else if (num2 == 5) {
                    if (!stack.empty()) {
                        sb.append(stack.peek()).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                }


            }


        }
        System.out.println(sb);
    }
}
