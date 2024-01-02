/*
[가까운 수]

* 문제 설명
  - 정수 배열 array와 정수 n이 매개변수로 주어질 때, array에 들어있는 정수 중 n과
    가장 가까운 수를 return 하도록 solution 함수를 완성해주세요.

* 제한사항
  - 1 ≤ array의 길이 ≤ 100
  - 1 ≤ array의 원소 ≤ 100
  - 1 ≤ n ≤ 100
  - 가장 가까운 수가 여러 개일 경우 더 작은 수를 return 합니다.
 */

import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int diff = n;
        int index = 0;
        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) return array[i];
            if (Math.abs(array[i] - n) < diff) {
                diff = Math.abs(array[i] - n);
                index = i;
            }
        }

        return array[index];
    }
}

public class NearestNumber
        {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(new int[]{10, 11, 12}, 13));
    }
}

/*
# Another Answer
 */