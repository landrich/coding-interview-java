/*
[짝수는 싫어요]

* 문제 설명
  - 정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.

* 제한사항
  - 1 ≤ n ≤ 100
 */

import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        int[] answer = new int[n / 2 + n % 2];
        Arrays.setAll(answer, i -> i * 2 + 1);
        return answer;
    }
}

public class HateEvenNumbers {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(15)));
    }
}

/*
# Another Answer
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n) {
        return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
    }
}
 */