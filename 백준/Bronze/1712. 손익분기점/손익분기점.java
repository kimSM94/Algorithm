import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int fixCost = Integer.parseInt(st.nextToken());
        int variableCost = Integer.parseInt(st.nextToken());
        int profit = Integer.parseInt(st.nextToken());

        System.out.print(solution(fixCost,variableCost,profit));
    }


    static int solution(int fixCost, int variableCost, int profit){
        int x = 1;
        while(true){

            if((profit-variableCost)*x>fixCost){
                break;
            }else if(profit-variableCost<1){
                x = -1;
                break;
            }
            x++;
        }


        return x;
    }
}
