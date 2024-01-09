/*
[잘라서 배열로 저장하기]

* 문제 설명
  - 문자열 my_str과 n이 매개변수로 주어질 때, my_str을 길이 n씩 잘라서
    저장한 배열을 return하도록 solution 함수를 완성해주세요.

* 제한사항
  - 1 ≤ my_str의 길이 ≤ 100
  - 1 ≤ n ≤ my_str의 길이
  - my_str은 알파벳 소문자, 대문자, 숫자로 이루어져 있습니다.
 */

import java.util.Arrays;

class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[(int) Math.ceil((double) my_str.length() / n)];
        int div = 0;

        for (int i = 0; i < answer.length; i++) {
            answer[i] = my_str.substring(div, Math.min(div + n, my_str.length()));
            div += n;
        }

        return answer;
    }
}

public class CutAndSaveAsArray {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution("abc1Addfggg4556b", 6)));
    }
}

/*
# Another Answer
 */