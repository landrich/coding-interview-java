/*
[배열의 원소 삭제하기]

* 문제 설명
  - 정수 배열 arr과 delete_list가 있습니다. arr의 원소 중 delete_list의 원소를 모두 삭제하고 남은 원소들은
    기존의 arr에 있던 순서를 유지한 배열을 return 하는 solution 함수를 작성해 주세요.

* 제한사항
  - 1 ≤ arr의 길이 ≤ 100
  - 1 ≤ arr의 원소 ≤ 1,000
  - arr의 원소는 모두 서로 다릅니다.
  - 1 ≤ delete_list의 길이 ≤ 100
  - 1 ≤ delete_list의 원소 ≤ 1,000
  - delete_list의 원소는 모두 서로 다릅니다.
 */

import java.util.Arrays;
import java.util.LinkedHashSet;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        LinkedHashSet<Integer> s1 = new LinkedHashSet<>();
        LinkedHashSet<Integer> s2 = new LinkedHashSet<>();

        for (int i : arr) s1.add(i);
        for (int i : delete_list) s2.add(i);

        s1.removeAll(s2);

        return s1.stream().mapToInt(Integer::intValue).toArray();
    }
}

public class DeleteElementsFromAnArray {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(new int[]{293, 1000, 395, 678, 94}, new int[]{94, 777, 104, 1000, 1, 12})));
    }
}

/*
# Another Answer
 */