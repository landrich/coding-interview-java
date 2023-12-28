/*
[소인수분해]

* 문제 설명
  - 소인수분해란 어떤 수를 소수들의 곱으로 표현하는 것입니다. 예를 들어 12를 소인수 분해하면 2 * 2 * 3 으로
    나타낼 수 있습니다. 따라서 12의 소인수는 2와 3입니다. 자연수 n이 매개변수로 주어질 때 n의 소인수를
    오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.

* 제한사항
  - 2 ≤ n ≤ 10,000
 */

import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        String answer = "";
        int div = 2;

        while(n != 1) {
            if(n % div == 0) {
                if (!answer.contains(Integer.toString(div))) answer += div + ",";
                n /= div;
            } else div++;
        }

        return Arrays.stream(answer.split(",")).mapToInt(Integer::parseInt).toArray();
    }
}

public class Factorization {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(420)));
    }
}

/*
# Another Answer
 */