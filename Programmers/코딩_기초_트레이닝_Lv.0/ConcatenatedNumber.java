/*
[이어 붙인 수]

* 문제 설명
  - 정수가 담긴 리스트 num_list가 주어집니다. num_list의 홀수만 순서대로 이어 붙인 수와
    짝수만 순서대로 이어 붙인 수의 합을 return하도록 solution 함수를 완성해주세요.

* 제한사항
  - 2 ≤ num_list의 길이 ≤ 10
  - 1 ≤ num_list의 원소 ≤ 9
  - num_list에는 적어도 한 개씩의 짝수와 홀수가 있습니다.
 */

class Solution {
    public int solution(int[] num_list) {
        String even = "";
        String odd = "";

        for (int i : num_list) {
            if (i % 2 == 0) even += i;
            else odd += i;
        }

        return Integer.parseInt(even) + Integer.parseInt(odd);
    }
}

public class ConcatenatedNumber {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(new int[]{3, 4, 5, 2, 1}));
    }
}

/*
# Another Answer
 */