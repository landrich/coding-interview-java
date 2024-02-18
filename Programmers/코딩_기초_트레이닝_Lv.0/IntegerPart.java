/*
[정수 부분]

* 문제 설명
  - 실수 flo가 매개 변수로 주어질 때, flo의 정수 부분을 return하도록 solution 함수를 완성해주세요.

* 제한사항
  - 0 ≤ flo ≤ 100
 */

class Solution {
    public int solution(double flo) {
        return (int) flo;
    }
}

public class IntegerPart {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(69.32));
    }
}

/*
# Another Answer
 */