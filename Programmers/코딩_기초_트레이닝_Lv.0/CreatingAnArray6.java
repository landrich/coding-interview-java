/*
[배열 만들기 6]

* 문제 설명
  - 0과 1로만 이루어진 정수 배열 arr가 주어집니다. arr를 이용해 새로운 배열 stk을 만드려고 합니다.
    i의 초기값을 0으로 설정하고 i가 arr의 길이보다 작으면 다음을 반복합니다.
      * 만약 stk이 빈 배열이라면 arr[i]를 stk에 추가하고 i에 1을 더합니다.
      * stk에 원소가 있고, stk의 마지막 원소가 arr[i]와 같으면 stk의 마지막 원소를 stk에서 제거하고 i에 1을 더합니다.
      * stk에 원소가 있는데 stk의 마지막 원소가 arr[i]와 다르면 stk의 맨 마지막에 arr[i]를 추가하고 i에 1을 더합니다.
    위 작업을 마친 후 만들어진 stk을 return 하는 solution 함수를 완성해 주세요.
    단, 만약 빈 배열을 return 해야한다면 [-1]을 return 합니다.

* 제한사항
  - 1 ≤ arr의 길이 ≤ 1,000,000
  - arr의 원소는 0 또는 1 입니다.
 */

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (answer.isEmpty()) answer.add(arr[i]);
            else if (arr[i] == answer.get(answer.size() - 1)) answer.remove(answer.size() - 1);
            else answer.add(arr[i]);
        }
        if (answer.isEmpty()) answer.add(-1);

        return answer.stream().mapToInt(i -> i).toArray();
    }
}

public class CreatingAnArray6 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(new int[]{0, 1, 1, 1, 0})));
    }
}

/*
# Another Answer
 */