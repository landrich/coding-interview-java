/*
[순서쌍의 개수]

* 문제 설명
  - 순서쌍이란 두 개의 숫자를 순서를 정하여 짝지어 나타낸 쌍으로 (a, b)로 표기합니다.
    자연수 n이 매개변수로 주어질 때 두 숫자의 곱이 n인 자연수 순서쌍의 개수를
    return하도록 solution 함수를 완성해주세요.

* 제한사항
  - 1 ≤ n ≤ 1,000,000
 */

class Solution {
    public int solution(int n) {
        int answer = 0;
        int sqrt = (int) Math.sqrt(n);

        for (int i = 1; i <= sqrt; i++) {
            if ((n / i) * i == n) answer++;
        }

        return sqrt * sqrt == n ? answer * 2 - 1 : answer * 2;
    }
}

public class NumberOfOrderedPairs {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(100));
    }
}

/*
# Another Answer
class Solution {
    public int solution(int n) {
        return (int) IntStream.rangeClosed(1, n).filter(i -> n % i == 0).count();
    }
}
 */