class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int orginX=x;
        int plus_x=0;
        while(x>0){
            plus_x+=x%10;
            x/=10;
        }
        if(orginX%plus_x!= 0){
            answer=false;
        }
        return answer;
    }
}