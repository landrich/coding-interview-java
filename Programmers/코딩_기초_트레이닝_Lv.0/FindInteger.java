/*
[정수 찾기]

* 문제 설명
  - 정수 리스트 num_list와 찾으려는 정수 n이 주어질 때, num_list안에 n이 있으면 1을
    없으면 0을 return하도록 solution 함수를 완성해주세요.

* 제한사항
  - 3 ≤ num_list의 길이 ≤ 100
  - 1 ≤ num_list의 원소 ≤ 100
  - 1 ≤ n ≤ 100
 */

class Solution {
    public int solution(int[] num_list, int n) {
        for (int i : num_list) {
            if (i == n) return 1;
        }

        return 0;
    }
}

public class FindInteger {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(new int[]{1, 2, 3, 4, 5}, 3));
    }
}

/*
# Another Answer
class Solution {
    public int solution(int[] numList, int n) {
        return IntStream.of(numList).anyMatch(num -> num == n) ? 1 : 0;
    }
}
 */