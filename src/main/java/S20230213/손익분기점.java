package S20230213;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 손익분기점 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int fixCost = Integer.parseInt(st.nextToken());
        int variableCost = Integer.parseInt(st.nextToken());
        int profit = Integer.parseInt(st.nextToken());

        System.out.println(solution(fixCost,variableCost,profit));
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
aSxxxsadsaasdaf asd aaSxfsaaad  azaasaaaSDD
        }


        return x;
    }
}
