import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();
        int test = Integer.parseInt(br.readLine());
        for (int i = 0; i < test; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num == 0) {
                stack.pop();
            }else{
                stack.push(num);
            }

        }
        System.out.println(stack.size() == 0 ? "0" : stack.stream().mapToInt(Integer::intValue).sum());

    }
}
