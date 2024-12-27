class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int p_Length= p.length();
        long p_value= Long.parseLong(p);
        
        for(int i=0;i<=t.length()-p_Length;i++){
            String subString = t.substring(i, i + p_Length);
             long subValue = Long.parseLong(subString);
            
            if(subValue<=p_value){
                answer++;
            }
            
        }
        return answer;
    }
}