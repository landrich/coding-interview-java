/*
[숫자 찾기]

* 문제 설명
  - 정수 num과 k가 매개변수로 주어질 때, num을 이루는 숫자 중에 k가 있으면
    num의 그 숫자가 있는 자리 수를 return하고 없으면 -1을 return 하도록 solution 함수를 완성해보세요.

* 제한사항
  - 0 < num < 1,000,000
  - 0 ≤ k < 10
  - num에 k가 여러 개 있으면 가장 처음 나타나는 자리를 return 합니다.
 */

class Solution {
    public int solution(int num, int k) {
        String[] strArr = String.valueOf(num).split("");

        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals(String.valueOf(k))) return i + 1;
        }

        return -1;
    }
}

public class FindNumbers {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(29183, 1));
    }
}

/*
# Another Answer
class Solution {
    public int solution(int num, int k) {
        return ("-" + num).indexOf(String.valueOf(k));
    }
}
 */