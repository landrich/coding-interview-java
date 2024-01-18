/*
[겹치는 선분의 길이]

* 문제 설명
  - 선분 3개가 평행하게 놓여 있습니다. 세 선분의 시작과 끝 좌표가 [[start, end], [start, end], [start, end]]
    형태로 들어있는 2차원 배열 lines가 매개변수로 주어질 때, 두 개 이상의 선분이 겹치는 부분의 길이를
    return 하도록 solution 함수를 완성해보세요.

* 제한사항
  - lines의 길이 = 3
  - lines의 원소의 길이 = 2
  - 모든 선분은 길이가 1 이상입니다.
  - lines의 원소는 [a, b] 형태이며, a, b는 각각 선분의 양 끝점 입니다.
  - -100 ≤ a < b ≤ 100
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        List<String> lineList = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        for (int[] line : lines) {
            for (int j = line[0]; j < line[1]; j++) {
                lineList.add(("" + j) + ("" + (j + 1)));
            }
        }
        for (String s : lineList) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 2) {
                answer++;
            }
        }

        return answer;
    }
}

public class LengthOfOverlappingLines {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(new int[][]{{0, 2}, {-3, -1}, {-2, 1}}));
    }
}

/*
# Another Answer
 */