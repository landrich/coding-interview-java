/*
[2의 영역]

* 문제 설명
  - 정수 배열 arr가 주어집니다. 배열 안의 2가 모두 포함된 가장 작은 연속된 부분 배열을
    return 하는 solution 함수를 완성해 주세요. 단, arr에 2가 없는 경우 [-1]을 return 합니다.

* 제한사항
  - 1 ≤ arr의 길이 ≤ 100,000
  - 1 ≤ arr의 원소 ≤ 10
 */

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> index = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                index.add(i);
            }
        }
        if (index.isEmpty()) return new int[]{-1};
        else if (index.size() == 1) return new int[]{2};
        else {
            return Arrays.copyOfRange(arr, index.get(0), index.get(index.size() - 1) + 1);
        }
    }
}

public class AreaOf2 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(new int[]{1, 2, 1, 4, 5, 2, 9})));
    }
}

/*
# Another Answer
 */