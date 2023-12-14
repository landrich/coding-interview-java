/*
[배열 두배 만들기]

* 문제 설명
  - 정수 배열 numbers가 매개변수로 주어집니다. numbers의 각 원소에 두배한 원소를 가진 배열을
    return하도록 solution 함수를 완성해주세요.

* 제한사항
  - 10,000 ≤ numbers의 원소 ≤ 10,000
  - 1 ≤ numbers의 길이 ≤ 1,000
 */

import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] *= 2;
        }
        return numbers;
    }
}

public class DoubleTheArray {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(new int[]{1, 2, 3, 4, 5})));
    }
}

/*
# Another Answer
class Solution {
    public int[] solution(int[] numbers) {
        return Arrays.stream(numbers).map(i -> i * 2).toArray();
    }
}
 */