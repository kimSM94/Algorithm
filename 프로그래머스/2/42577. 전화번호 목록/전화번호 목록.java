import java.util.Arrays;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

                  Arrays.sort(phone_book); // 전화번호를 사전순으로 정렬

        for (int i = 0; i < phone_book.length - 1; i++) {
            // 현재 전화번호와 다음 전화번호가 서로의 접두어인지 확인
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                return false;
            }
        }

        return answer;
    }
}