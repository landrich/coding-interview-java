/*
[카운트 업]

* 문제 설명
  - 정수 start_num와 end_num가 주어질 때, start_num부터 end_num까지의 숫자를 차례로 담은
    리스트를 return하도록 solution 함수를 완성해주세요.

* 제한사항
  - 0 ≤ start_num ≤ end_num ≤ 50
 */

import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int start_num, int end_num) {
        return IntStream.range(start_num, end_num + 1).toArray();
    }
}

public class CountUp {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(3, 10)));
    }
}

/*
# Another Answer
 */