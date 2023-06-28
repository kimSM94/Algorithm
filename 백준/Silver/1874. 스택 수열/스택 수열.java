import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

     public static void main(String[] args) throws IOException {
        solve();
    }

    
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();

        int testCaseCount = Integer.parseInt(br.readLine());
        int current = 1; // 현재 수열에서 처리해야 할 숫자
        boolean isPossible = true;

        for (int i = 0; i < testCaseCount; i++) {
            int targetNumber = Integer.parseInt(br.readLine());

            while (current <= targetNumber) {
                stack.push(current);
                sb.append("+").append("\n");
                current++;
            }

            if (stack.peek() == targetNumber) {
                stack.pop();
                sb.append("-").append("\n");
            } else {
                isPossible = false;
                break;
            }
        }

        if (isPossible) {
            System.out.println(sb);
        } else {
            System.out.println("NO");
        }
    }
}
