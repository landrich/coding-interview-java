/*
[접미사인지 확인하기]

* 문제 설명
  - 어떤 문자열에 대해서 접미사는 특정 인덱스부터 시작하는 문자열을 의미합니다.
    예를 들어, "banana"의 모든 접미사는 "banana", "anana", "nana", "ana", "na", "a"입니다.
    문자열 my_string과 is_suffix가 주어질 때, is_suffix가 my_string의 접미사라면 1을,
    아니면 0을 return 하는 solution 함수를 작성해 주세요.

* 제한사항
  - 1 ≤ my_string의 길이 ≤ 100
  - 1 ≤ is_suffix의 길이 ≤ 100
  - my_string과 is_suffix는 영소문자로만 이루어져 있습니다.
 */

class Solution {
    public int solution(String my_string, String is_suffix) {
        for (int i = 0; i < my_string.length(); i++) {
            if (is_suffix.equals(my_string.substring(i))) return 1;
        }

        return 0;
    }
}

public class CheckIfItIsASuffix {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("banana", "wxyz"));
    }
}

/*
# Another Answer
 */