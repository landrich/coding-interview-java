/*
[분수의 덧셈]

* 문제 설명
  - 첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 두 번째 분수의 분자와 분모를 뜻하는
    numer2, denom2가 매개변수로 주어집니다. 두 분수를 더한 값을 기약 분수로 나타냈을 때
    분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.

* 제한사항
  - 0 < numer1, denom1, numer2, denom2 < 1,000
 */

import java.math.BigInteger;
import java.util.Arrays;

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        BigInteger den1 = BigInteger.valueOf(denom1);
        BigInteger den2 = BigInteger.valueOf(denom2);
        BigInteger num1 = BigInteger.valueOf(numer1);
        BigInteger num2 = BigInteger.valueOf(numer2);

        //분수 덧셈
        BigInteger denSum = den1.multiply(den2).divide(den1.gcd(den2));
        BigInteger numSum = denSum.divide(den1).multiply(num1).add(denSum.divide(den2).multiply(num2));

        //기약 분수
        //제한사항 조건 상 각각 1000미만 이므로 int형 변환처리. 예외처리 생략.
        answer[0] = numSum.divide(denSum.gcd(numSum)).intValue();
        answer[1] = denSum.divide(denSum.gcd(numSum)).intValue();

        return answer;
    }
}

public class AdditionOfFractions {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(2, 6, 7, 15)));
    }
}