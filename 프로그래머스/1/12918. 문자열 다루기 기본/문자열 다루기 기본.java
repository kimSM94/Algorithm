class Solution {
    public boolean solution(String s) {
        boolean answer = true;
          
          
        return  (s.length() == 4 || s.length() == 6) && s.matches("[0-9]+");
    }
}