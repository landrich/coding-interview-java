/*
[배열 만들기 2]

* 문제 설명
  - 정수 l과 r이 주어졌을 때, l 이상 r이하의 정수 중에서 숫자 "0"과 "5"로만 이루어진 모든 정수를
    오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
    만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.

* 제한사항
  - 1 ≤ l ≤ r ≤ 1,000,000
 */

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> answer = new ArrayList<>();
        int num;

        for (int i = 1; i <= 64; i++) {
            num = Integer.parseInt(Integer.toBinaryString(i)) * 5;
            if (num >= l && num <= r) {
                answer.add(num);
            }
        }

        return answer.isEmpty() ? new int[]{-1} : answer.stream().mapToInt(i -> i).toArray();
    }
}

public class CreatingAnArray2 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(5, 555)));
    }
}

/*
# Another Answer
 */