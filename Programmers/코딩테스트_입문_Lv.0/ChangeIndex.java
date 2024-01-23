/*
[인덱스 바꾸기]

* 문제 설명
  - 문자열 my_string과 정수 num1, num2가 매개변수로 주어질 때, my_string에서 인덱스 num1과 인덱스 num2에
    해당하는 문자를 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.

* 제한사항
  - 1 < my_string의 길이 < 100
  - 0 ≤ num1, num2 < my_string의 길이
  - my_string은 소문자로 이루어져 있습니다.
  - num1 ≠ num2
 */

class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            if (i == num1) answer += my_string.charAt(num2);
            else if (i == num2) answer += my_string.charAt(num1);
            else answer += my_string.charAt(i);
        }

        return answer;
    }
}

public class ChangeIndex
        {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("I love you", 3, 6));
    }
}

/*
# Another Answer
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public String solution(String myString, int num1, int num2) {
        List<String> list = Arrays.stream(myString.split("")).collect(Collectors.toList());

        Collections.swap(list, num1, num2);
        return String.join("", list);
    }
}
 */