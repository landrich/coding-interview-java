/*
[A로 B 만들기]

* 문제 설명
  - 문자열 before와 after가 매개변수로 주어질 때, before의 순서를 바꾸어 after를 만들 수 있으면 1을,
    만들 수 없으면 0을 return 하도록 solution 함수를 완성해보세요.

* 제한사항
  - 0 < before의 길이 == after의 길이 < 1,000
  - before와 after는 모두 소문자로 이루어져 있습니다.
 */

class Solution {
    public int solution(String before, String after) {
        int length = before.length();

        for (int i = 0; i < length; i++) {
            after = after.replaceFirst(String.valueOf(before.charAt(i)), "");
        }

        return after.isEmpty() ? 1 : 0;
    }
}

public class MakeBWithA {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("allpe", "apple"));
    }
}

/*
# Another Answer
 */