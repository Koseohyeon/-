import java.util.Arrays;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int budget_sum=0;
        Arrays.sort(d);
        for(int i=0;i<d.length;i++){
            if(budget_sum+d[i]<=budget){
                budget_sum+=d[i];
                answer++;
            }else{
                break;
            }
            
        }
        return answer;
    }
}