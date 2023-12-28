/*
[최댓값 만들기 (1)]

* 문제 설명
  - 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소 중 두 개를 곱해 만들 수 있는
    최댓값을 return하도록 solution 함수를 완성해주세요.

* 제한사항
  - 0 ≤ numbers의 원소 ≤ 10,000
  - 2 ≤ numbers의 길이 ≤ 100
 */

import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1] * numbers[numbers.length - 2];
    }
}

public class CreateMaximumValue1 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println((sol.solution(new int[]{1, 2, 3, 4, 5})));
    }
}

/*
# Another Answer
 */