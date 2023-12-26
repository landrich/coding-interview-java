/*
[배열 회전시키기]

* 문제 설명
  - 정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어집니다.
    배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을 return하도록 solution 함수를 완성해주세요.

* 제한사항
  - 3 ≤ numbers의 길이 ≤ 20
  - direction은 "left" 와 "right" 둘 중 하나입니다.
 */

import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        if (direction.equals("right")) {
            answer[0] = numbers[numbers.length - 1];
            System.arraycopy(numbers, 0, answer, 1, numbers.length - 1);
        } else {
            answer = Arrays.copyOfRange(numbers, 1, numbers.length + 1);
            answer[answer.length - 1] = numbers[0];
        }

        return answer;
    }
}

public class RotateAnArray {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println((Arrays.toString(sol.solution(new int[]{4, 455, 6, 4, -1, 45, 6}, "left"))));
    }
}

/*
# Another Answer
 */