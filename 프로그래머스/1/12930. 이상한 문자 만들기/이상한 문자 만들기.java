class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder(); // 결과를 저장할 StringBuilder
        String[] words = s.split(" ", -1); // 공백도 유지하며 분리

        for (int i = 0; i < words.length; i++) {
            StringBuilder transformedWord = new StringBuilder(); // 변환된 단어를 저장
            for (int j = 0; j < words[i].length(); j++) {
                char c = words[i].charAt(j); // 단어의 j번째 문자 가져오기
                if (j % 2 == 0) { // 짝수 인덱스
                    transformedWord.append(Character.toUpperCase(c));
                } else { // 홀수 인덱스
                    transformedWord.append(Character.toLowerCase(c));
                }
            }
            answer.append(transformedWord); // 변환된 단어 추가
            if (i < words.length - 1) {
                answer.append(" "); // 단어 사이에 공백 추가
            }
        }
        return answer.toString(); // 결과 문자열 반환
    }
}
