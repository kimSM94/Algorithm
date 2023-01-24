public class 두_수의_나눗셈 {
    public int solution(int num1, int num2) {
        int answer2 = 0;
        double answer = answer2;
        answer = (double)num1/(double)num2 * 1000;
        System.out.println((int)answer);
        return (int) answer;
    }

    public static void main(String[] args) {
        두_수의_나눗셈 solution = new 두_수의_나눗셈();
        solution.solution(3, 2);
    }

}