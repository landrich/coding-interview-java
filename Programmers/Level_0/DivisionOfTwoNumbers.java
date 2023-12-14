/*
[두 수의 나눗셈]

* 문제 설명
  - 정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록
    soltuion 함수를 완성해주세요.

* 제한사항
  - 0 < num1 ≤ 100
  - 0 < num2 ≤ 100
 */

class Solution {
    public int solution(int num1, int num2) {
        if ((num1 > 0 && num1 <= 100) && (num2 > 0 && num2 <= 100)) {
            return (int) (((float)num1 / (float)num2) * 1000);
        }
        return -1;
    }
}

public class DivisionOfTwoNumbers {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(7, 3));
    }
}

/*
# Another Answer
class Solution {
    public int solution(int num1, int num2) {
        return num1 * 1000 / num2;
    }
}
 */