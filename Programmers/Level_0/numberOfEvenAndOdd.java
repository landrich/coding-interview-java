/*
[짝수 홀수 개수]

* 문제 설명
  - 정수가 담긴 리스트 num_list가 주어질 때, num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을
    return 하도록 solution 함수를 완성해보세요.

* 제한사항
  - 1 ≤ num_list의 길이 ≤ 100
  - 0 ≤ num_list의 원소 ≤ 1,000
 */

import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];

        for (int i : num_list) {
            if (i % 2 == 0) answer[0]++;
            else answer[1]++;
        }
        return answer;
    }
}

public class numberOfEvenAndOdd{
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(new int[]{1, 2, 3, 4, 5})));
    }
}

/*
# Another Answer
        for(int i = 0; i < num_list.length; i++)
            answer[num_list[i] % 2]++;
 */