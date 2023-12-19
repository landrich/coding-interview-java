/*
[문자열 뒤집기]

* 문제 설명
  - 문자열 my_string이 매개변수로 주어집니다. my_string을 거꾸로 뒤집은 문자열을
    return하도록 solution 함수를 완성해주세요.

* 제한사항
  - 1 ≤ my_string의 길이 ≤ 1,000
 */

class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (int i = my_string.length() - 1; i >= 0; i--) {
            answer += my_string.charAt(i);
        }
        return answer;
    }
}

public class FlipString{
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("apple"));
    }
}

/*
# Another Answer
class Solution {
    public String solution(String myString) {
        return new StringBuilder(myString).reverse().toString();
    }
}
 */