package old;

public class 짝수의_합 {
    public int solution(int n) {
        int answer = 0;

        for(int i =1 ; i<=n;i++){
            if(i%2==0){
                answer +=i;
            }
        }
        System.out.println(answer);


        return answer;
    }

    public static void main(String[] args) {
        짝수의_합 solution = new 짝수의_합();
        solution.solution(10);
    }

}