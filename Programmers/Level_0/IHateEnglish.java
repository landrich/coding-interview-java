/*
[영어가 싫어요]

* 문제 설명
  - 영어가 싫은 머쓱이는 영어로 표기되어있는 숫자를 수로 바꾸려고 합니다.
    문자열 numbers가 매개변수로 주어질 때, numbers를 정수로 바꿔 return 하도록 solution 함수를 완성해 주세요.

* 제한사항
  - numbers는 소문자로만 구성되어 있습니다.
  - numbers는 "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" 들이
    공백 없이 조합되어 있습니다.
  - 1 ≤ numbers의 길이 ≤ 50
  - "zero"는 numbers의 맨 앞에 올 수 없습니다.
 */

class Solution {
    public long solution(String numbers) {
        String answer = numbers.replace("zero" , "0")
                                .replace("one", "1")
                                .replace("two", "2")
                                .replace("three", "3")
                                .replace("four", "4")
                                .replace("five", "5")
                                .replace("six", "6")
                                .replace("seven", "7")
                                .replace("eight", "8")
                                .replace("nine", "9");

        return Long.parseLong((answer));
    }
}

public class IHateEnglish
        {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("onetwothreefourfivesixseveneightnine"));
    }
}

/*
# Another Answer
class Solution {
    public long solution(String numbers) {

            String[] numbers_arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

            for (int i = 0; i < numbers_arr.length; i++) {
                numbers = numbers.replaceAll(numbers_arr[i], String.valueOf(i));
            }

            long answer = Long.parseLong(numbers);
            return answer;
        }
}
 */