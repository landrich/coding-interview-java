/*
[대문자와 소문자]

* 문제 설명
  - 문자열 my_string이 매개변수로 주어질 때, 대문자는 소문자로 소문자는 대문자로 변환한
    문자열을 return하도록 solution 함수를 완성해주세요.

* 제한사항
  - 1 ≤ my_string의 길이 ≤ 1,000
  - my_string은 영어 대문자와 소문자로만 구성되어 있습니다.
 */

class Solution {
    public String solution(String my_string) {
        String answer = "";
        Character ch;

        for (int i = 0; i < my_string.length(); i++) {
            ch = my_string.charAt(i);
            answer += (ch >= 65 && ch <= 90) ? String.valueOf(ch).toLowerCase() : String.valueOf(ch).toUpperCase();
        }

        return answer;
    }
}

public class UpperAndLowerLetters
        {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("cccCCC"));
    }
}

/*
# Another Answer
 */