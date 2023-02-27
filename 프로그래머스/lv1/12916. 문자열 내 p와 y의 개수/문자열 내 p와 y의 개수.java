class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int yCount=0;
        int pCount =0;
        
        for(int i =0; i<s.length(); i++){
           char test =s.charAt(i);
           if(test== 'p' || test == 'P'){
              pCount++;
           }else if(test== 'y'|| test == 'Y'){
               yCount++;
           }
        }
        
        if(pCount==yCount){
          answer =true;
        }else{ answer =false;}
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}