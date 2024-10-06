class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;

        // wallet의 긴 쪽과 짧은 쪽을 구분
        int wallet_s = Math.min(wallet[0], wallet[1]);
        int wallet_b = Math.max(wallet[0], wallet[1]);

        // bill의 긴 쪽과 짧은 쪽을 구분
        int bill_s = Math.min(bill[0], bill[1]);
        int bill_b = Math.max(bill[0], bill[1]);

        // 지폐가 지갑에 들어갈 수 있을 때까지 반복
        while (true) {
            // 현재 지폐가 지갑에 들어갈 수 있는지 확인
            if ((bill_s <= wallet_s && bill_b <= wallet_b) || (bill_b <= wallet_s && bill_s <= wallet_b)) {
                break; // 들어갈 수 있으면 종료
            }

            // 긴 쪽을 항상 먼저 접는다
            if (bill_b > bill_s) {
                bill_b /= 2; // 긴 쪽을 접기
            } else {
                bill_s /= 2; // 짧은 쪽을 접기
            }
            answer++; // 접을 때마다 카운트를 증가시킨다
        }

        return answer;
    }
}
