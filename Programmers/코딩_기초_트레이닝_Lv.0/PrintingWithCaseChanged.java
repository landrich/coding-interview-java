/*
[대소문자 바꿔서 출력하기]

* 문제 설명
  - 영어 알파벳으로 이루어진 문자열 str이 주어집니다. 각 알파벳을 대문자는 소문자로
    소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.

* 제한사항
  - 1 ≤ str의 길이 ≤ 20
  - str은 알파벳으로 이루어진 문자열입니다.
 */

import java.util.Scanner;

public class PrintingWithCaseChanged {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(), answer = "";

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) >= 65 && a.charAt(i) <= 90) {
                answer += String.valueOf(a.charAt(i)).toLowerCase();
            } else {
                answer += String.valueOf(a.charAt(i)).toUpperCase();
            }
        }

        System.out.println(answer);
    }
}

/*
# Another Answer
 */