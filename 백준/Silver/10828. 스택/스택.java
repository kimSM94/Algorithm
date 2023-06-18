import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < num; i++) {

            String word = br.readLine();

            // 정수 X를 스택에 넣는 연산이다.
            if ("push".equals(word.split(" ")[0])) {
                stack.push(Integer.parseInt(word.split(" ")[1]));
            }

            if ("pop".equals(word)) {
                if (stack.size() != 0) {
                    sb.append(stack.get(stack.size() - 1)).append("\n");
                    stack.pop();
                } else {
                    sb.append(-1).append("\n");
                }

            }

            if ("size".equals(word)) {
                sb.append(stack.size()).append("\n");
            }

            // 스택이 비어있으면 1, 아니면 0을 출력한다.
            if ("empty".equals(word)) {
                if (stack.size() == 0) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            }

            // 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다
            if ("top".equals(word)) {
                if (stack.size() == 0) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(stack.peek()).append("\n");
                }
            }
        }
        System.out.print(sb);

        br.close();
    }


}
