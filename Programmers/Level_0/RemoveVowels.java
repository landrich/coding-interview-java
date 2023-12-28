/*
[모음 제거]

* 문제 설명
  - 영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다. 문자열 my_string이 매개변수로 주어질 때
    모음을 제거한 문자열을 return하도록 solution 함수를 완성해주세요.

* 제한사항
  - my_string은 소문자와 공백으로 이루어져 있습니다.
  - 1 ≤ my_string의 길이 ≤ 1,000
 */

import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string) {
        return my_string.chars()
                        .filter(c -> "aeiou".indexOf(c) == -1)
                        .mapToObj(c -> String.valueOf((char) c))
                        .collect(Collectors.joining());
    }
}

public class RemoveVowels {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println((sol.solution("nice to meet you")));
    }
}

/*
# Another Answer
class Solution {
    public String solution(String my_string) {
        String answer = "";

        answer = my_string.replaceAll("[aeiou]", "");

        return answer;
    }
}
 */