/*
[두 수의 합]

* 문제 설명
  - 0 이상의 두 정수가 문자열 a, b로 주어질 때, a + b의 값을 문자열로 return 하는 solution 함수를 작성해 주세요.

* 제한사항
  - 1 ≤ a의 길이 ≤ 100,000
  - 1 ≤ b의 길이 ≤ 100,000
  - a와 b는 숫자로만 이루어져 있습니다.
  - a와 b는 정수 0이 아니라면 0으로 시작하지 않습니다.
 */

import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        BigInteger num1 = new BigInteger(a);
        BigInteger num2 = new BigInteger(b);

        return "" + num1.add(num2);
    }
}

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("18446744073709551615", "287346502836570928366"));
    }
}

/*
# Another Answer
 */