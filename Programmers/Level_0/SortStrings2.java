/*
[문자열 정렬하기 (2)]

* 문제 설명
  - 영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때, my_string을 모두 소문자로 바꾸고
    알파벳 순서대로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.

* 제한사항
  - 0 < my_string 길이 < 100
 */

import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string) {
        String lower = my_string.toLowerCase();
        String[] strArr = lower.split("");

        return Arrays.stream(strArr).sorted().collect(Collectors.joining());
    }
}

public class SortStrings2 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("heLLo"));
    }
}

/*
# Another Answer
 */