/*
[가장 큰 수 찾기]

* 문제 설명
  - 정수 배열 array가 매개변수로 주어질 때, 가장 큰 수와 그 수의 인덱스를 담은 배열을
    return 하도록 solution 함수를 완성해보세요.

* 제한사항
  - 1 ≤ array의 길이 ≤ 100
  - 0 ≤ array 원소 ≤ 1,000
  - array에 중복된 숫자는 없습니다.
 */

import java.util.Arrays;

class Solution {
    public int[] solution(int[] array) {
        int maxValue = 0;
        int maxIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (maxValue < array[i]) {
                maxValue = array[i];
                maxIndex = i;
            }
        }

        return new int[]{maxValue, maxIndex};
    }
}

public class FindTheLargestNumber {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(new int[]{9, 10, 11, 8})));
    }
}

/*
# Another Answer
 */