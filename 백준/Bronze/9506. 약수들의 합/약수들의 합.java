import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){

            int num = Integer.parseInt(br.readLine());

            if(num==-1) break;

            int[] arr = new int[num];
            int arrIndex = 0;
            int sum = 0;
            for (int i = 1; i < num; i++) {
                if(num%i==0){
                    arr[arrIndex++] = i;
                    sum += i;
                }
            }
            if(sum != num){
               sb.append(num + " is NOT perfect.");
            }else {
                sb.append(num + " = ");
                for (int i = 0; i < arrIndex; i++) {
                    if (i == arrIndex - 1) {
                        sb.append(arr[i]);
                    } else {
                        sb.append(arr[i] + " + ");
                    }
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);



    }
}
