/*
[문자열 여러 번 뒤집기]

* 문제 설명
  - 문자열 my_string과 이차원 정수 배열 queries가 매개변수로 주어집니다. queries의 원소는 [s, e] 형태로,
    my_string의 인덱스 s부터 인덱스 e까지를 뒤집으라는 의미입니다. my_string에 queries의 명령을 순서대로
    처리한 후의 문자열을 return 하는 solution 함수를 작성해 주세요.

* 제한사항
  - my_string은 영소문자로만 이루어져 있습니다.
  - 1 ≤ my_string의 길이 ≤ 1,000
  - queries의 원소는 [s, e]의 형태로 0 ≤ s ≤ e < my_string의 길이를 만족합니다.
  - 1 ≤ queries의 길이 ≤ 1,000
 */

class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        StringBuilder temp = new StringBuilder();

        for (int[] query : queries) {
            answer = my_string.substring(0, query[0]);
            answer += temp.append(my_string, query[0], query[1] + 1).reverse();
            answer += my_string.substring(query[1] + 1);
            my_string = answer;
            temp = new StringBuilder();
        }

        return answer;
    }
}

public class FlipAStringMultipleTimes {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("rermgorpsam", new int[][]{{2, 3}, {0, 7}, {5, 9}, {6, 10}}));
    }
}

/*
# Another Answer
 */