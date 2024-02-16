/*
[뒤에서 5등까지]

* 문제 설명
  - 정수로 이루어진 리스트 num_list가 주어집니다. num_list에서 가장 작은 5개의 수를 오름차순으로
    담은 리스트를 return하도록 solution 함수를 완성해주세요.

* 제한사항
  - 6 ≤ num_list의 길이 ≤ 30
  - 1 ≤ num_list의 원소 ≤ 100
 */

import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        return Arrays.stream(num_list).sorted().limit(5).toArray();
    }
}

public class FromTheBackToTheTop5 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(new int[]{12, 4, 15, 46, 38, 1, 14})));
    }
}

/*
# Another Answer
 */