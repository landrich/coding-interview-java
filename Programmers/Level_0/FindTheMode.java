/*
[최빈값 구하기]

* 문제 설명
  - 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 정수 배열 array가 매개변수로 주어질 때,
    최빈값을 return 하도록 solution 함수를 완성해보세요. 최빈값이 여러 개면 -1을 return 합니다.

* 제한사항
  - 0 < array의 길이 < 100
  - 0 ≤ array의 원소 < 1000
 */

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();

        if (array.length == 1) return array[0];

        for (int i : array) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int maxMode = 0, answerKey = -1;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int mapValue = entry.getValue();
            int mapKey = entry.getKey();
            if (mapValue > maxMode) {
                maxMode = mapValue;
                answerKey = mapKey;
            } else if (mapValue == maxMode) answerKey = -1;
        }
        return answerKey;
    }
}

public class FindTheMode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(new int[]{1,2,3,3,3,4,4,4,4,4}));
    }
}