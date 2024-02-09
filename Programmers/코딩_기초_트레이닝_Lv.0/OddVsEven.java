/*
[홀수 vs 짝수]

* 문제 설명
  - 정수 리스트 num_list가 주어집니다. 가장 첫 번째 원소를 1번 원소라고 할 때, 홀수 번째 원소들의 합과 짝수 번째
    원소들의 합 중 큰 값을 return 하도록 solution 함수를 완성해주세요. 두 값이 같을 경우 그 값을 return합니다.

* 제한사항
  - 5 ≤ num_list의 길이 ≤ 50
  - -9 ≤ num_list의 원소 ≤ 9
 */

class Solution {
    public int solution(int[] num_list) {
        int evenSum = 0, oddSum = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) evenSum += num_list[i];
            else oddSum += num_list[i];
        }

        return Math.max(evenSum, oddSum);
    }
}

public class OddVsEven {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(new int[]{4, 2, 6, 1, 7, 6}));
    }
}

/*
# Another Answer
 */