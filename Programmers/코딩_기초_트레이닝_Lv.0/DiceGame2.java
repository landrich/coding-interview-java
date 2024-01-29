/*
[주사위 게임 2]

* 문제 설명
  - 1부터 6까지 숫자가 적힌 주사위가 세 개 있습니다. 세 주사위를 굴렸을 때 나온 숫자를 각각
    a, b, c라고 했을 때 얻는 점수는 다음과 같습니다.
      * 세 숫자가 모두 다르다면 a + b + c 점을 얻습니다.
      * 세 숫자 중 어느 두 숫자는 같고 나머지 다른 숫자는 다르다면 (a + b + c) × (a^2 + b^2 + c^2 )점을 얻습니다.
      * 세 숫자가 모두 같다면 (a + b + c) × (a^2 + b^2 + c^2 ) × (a^3 + b^3 + c^3 )점을 얻습니다.
    세 정수 a, b, c가 매개변수로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.

* 제한사항
  - a, b, c는 1이상 6이하의 정수입니다.
 */

class Solution {
    public int solution(int a, int b, int c) {
        int answer = 1, cnt = 0;

        if (a != b && b != c && a != c) cnt = 1;
        else if (a == b && b == c) cnt = 3;
        else cnt = 2;

        for (int i = 1; i <= cnt; i++) {
            answer *= (int) (Math.pow(a, i) + Math.pow(b, i) + Math.pow(c, i));
        }

        return answer;
    }
}

public class DiceGame2 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(2, 6, 1));
    }
}

/*
# Another Answer
 */