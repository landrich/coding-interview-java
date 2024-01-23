/*
[합성수 찾기]

* 문제 설명
  - 약수의 개수가 세 개 이상인 수를 합성수라고 합니다. 자연수 n이 매개변수로 주어질 때
    n이하의 합성수의 개수를 return하도록 solution 함수를 완성해주세요.

* 제한사항
  - 1 ≤ n ≤ 100
 */

class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;

        for (int i = 4; i <= n; i++) {
            count = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) count++;
                if (count >= 2) {
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }
}

public class FindCompositeNumbers {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println((sol.solution(15)));
    }
}

/*
# Another Answer
 */