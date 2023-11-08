문제 설명
단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 
단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

재한사항
s는 길이가 1 이상, 100이하인 스트링입니다.
입출력      예
s                return
"abcde"     "c"
"qwer"       "we"

 

=================================================================

ANSWER

class Solution {
    public String solution(String s) {
        String answer = "";
        
        if(s.length() % 2 == 0){ //짝수
            answer = s.substring(s.length()/2-1, s.length()/2+1);

              *s.length() / 2 - 1는 문자열의 중간에서 왼쪽 글자의 인덱스를 계산합니다.


        }else { //홀수
            answer = s.substring(s.length()/2, s.length()/2+1);

             * s.length() / 2 + 1은 문자열의 중간에서 오른쪽 글자 다음 인덱스를 계산합니다.
        }

        return answer;
    }
}

 

문제해설

substring을 이용해서 문자열을 추출

'substring'= 메서드는 문자열에서 일부분을 추출하여 새로운 문자열을 생성하는 메서드입니다.

'substring'= 시작 위치(인덱스)와 종료 위치(인덱스)를 지정하여 원하는 부분 문자열을 선택합니다.

'substring'= 메서드를 사용하여 문자열을 추출하면 새로운 문자열이 반환되며, 원래 문자열은 변경되지 않습니다.

                   반환된 문자열은 선택한 부분 문자열에 해당합니다.

EX)

String substring(int startIndex)

String substring(int startIndex, int endIndex)

- startIndex: 추출을 시작할 문자열 내의 인덱스(0부터 시작)를 지정합니다. 이 위치의 문자를 포함하여 추출이 시작됩니다.

- endIndex: 추출을 종료할 문자열 내의 인덱스를 지정합니다. 이 위치의 문자는 포함되지 않고 추출이 종료됩니다.                                
endIndex는 옵션으로, 지정하지 않으면 시작 위치(startIndex)로부터 문자열 끝까지 추출됩니다.