package kdms;

public class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for (int i = 0 ; i < babbling.length ; i++ ) {
        	 String bab = babbling[i];
        	 String [] say = bab.split("aya|ye|woo|ma");
             if (say.length == 0) {
                 answer ++;                          
              }         
        } 
        return answer;
    }
}
