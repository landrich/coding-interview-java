/*
[문자열로 변환]

* 문제 설명
  - 정수 n이 주어질 때, n을 문자열로 변환하여 return하도록 solution 함수를 완성해주세요.

* 제한사항
  - 1 ≤ n ≤ 10000
 */

class Solution {
    public String solution(int n) {
        return String.valueOf(n);
    }
}

public class ConvertToString {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(123));
    }
}

/*
# Another Answer
 */