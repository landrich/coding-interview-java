/*
[배열 뒤집기]

* 문제 설명
  - 정수가 들어 있는 배열 num_list가 매개변수로 주어집니다. num_list의 원소의 순서를
    거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.

* 제한사항
  - 1 ≤ num_list의 길이 ≤ 1,000
  - 0 ≤ num_list의 원소 ≤ 1,000
 */

import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for (int i = 0; i < answer.length; i++) answer[i] = num_list[num_list.length - i - 1];
        return answer;

    }
}

public class FlipArray{
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(new int[]{1, 2, 3, 4, 5})));
    }
}

/*
# Another Answer
class Solution {
    public int[] solution(int[] num_list) {
        return IntStream.range(1, num_list.length + 1).map(i -> num_list[(num_list.length - i)]).toArray();
    }
}
 */