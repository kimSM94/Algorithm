class Solution {
    public String solution(String s) {{
            String answer = "";
            char[] a = s.toCharArray();
            if(s.length()%2==0){
                answer =a[a.length/2-1]+""+a[a.length/2];
            }else{
                answer = a[a.length / 2]+"";
            }



            return answer;
        }}
}