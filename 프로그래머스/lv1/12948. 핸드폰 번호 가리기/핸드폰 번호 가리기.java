class Solution {
   public static StringBuilder solution(String phone_number) {
        String answer = "";

        String last = phone_number.substring(0,phone_number.length()-4);
        String last2 = phone_number.substring(phone_number.length()-4);
        StringBuilder sb = new StringBuilder();

        String[] arr = new String[last.length()];

        for (int i = 0; i < last.length(); i++) {
            arr[i] = "*";
        }

        for (String value : arr) {
            sb.append(value);
        }
        sb.append(last2);

        return sb;
    }
}