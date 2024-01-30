/*
[수열과 구간 쿼리 3]

* 문제 설명
  - 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [i, j] 꼴입니다.
  - 각 query마다 순서대로 arr[i]의 값과 arr[j]의 값을 서로 바꿉니다.
  - 위 규칙에 따라 queries를 처리한 이후의 arr를 return 하는 solution 함수를 완성해 주세요.

* 제한사항
  - 1 ≤ arr의 길이 ≤ 1,000
  - 0 ≤ arr의 원소 ≤ 1,000,000
  - 1 ≤ queries의 길이 ≤ 1,000
  - 0 ≤ i < j < arr의 길이
 */

import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = Arrays.copyOf(arr, arr.length);
        int temp;

        for (int[] query : queries) {
            temp = answer[query[0]];
            answer[query[0]] = answer[query[1]];
            answer[query[1]] = temp;
        }

        return answer;
    }
}

public class SequenceAndIntervalQueries3 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(new int[]{0, 1, 2, 3, 4}, new int[][]{{0, 3}, {1, 2}, {1, 4}})));
    }
}

/*
# Another Answer
 */