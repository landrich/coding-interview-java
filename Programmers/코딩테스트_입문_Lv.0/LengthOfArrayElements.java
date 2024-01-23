/*
[배열 원소의 길이]

* 문제 설명
  - 문자열 배열 strlist가 매개변수로 주어집니다. strlist 각 원소의 길이를 담은 배열을
    retrun하도록 solution 함수를 완성해주세요.

* 제한사항
  - 1 ≤ strlist 원소의 길이 ≤ 100
  - strlist는 알파벳 소문자, 대문자, 특수문자로 구성되어 있습니다.
 */

import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(String[] strlist) {
        return IntStream.range(0, strlist.length).map(i -> strlist[i].length()).toArray();
    }
}

public class LengthOfArrayElements
        {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(new String[]{"We", "are", "the", "world!"})));
    }
}

/*
# Another Answer
class Solution {
    public int[] solution(String[] strList) {
        return Arrays.stream(strList).mapToInt(String::length).toArray();
    }
}
 */