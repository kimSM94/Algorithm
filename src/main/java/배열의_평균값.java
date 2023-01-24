public class 배열의_평균값 {
    public double solution(int[] numbers) {
        double answer = 0;

        for(int i =0; i<numbers.length;i++){
            answer += numbers[i];
        }

        System.out.println(answer/numbers.length);
        return answer;
    }

    public static void main(String[] args) {
        배열의_평균값 solution = new 배열의_평균값();
        solution.solution(new int[]{1,2,3,4,5});
    }

}