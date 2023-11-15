문제 설명
문자열 myString이 주어집니다.
myString에서 알파벳 "a"가 등장하면 전부 "A"로 변환하고, 
"A"가 아닌 모든 대문자 알파벳은 소문자 알파벳으로 변환하여 
return 하는 solution 함수를 완성하세요.

제한사항
1 ≤ myString의 길이 ≤ 20
myString은 알파벳으로 이루어진 문자열입니다.

입출력 예
myString	        result
"abstract algebra"	"AbstrAct AlgebrA"
"PrOgRaMmErS"	    "progrAmmers"

입출력 예 설명

입출력 예 #1
0번, 5번, 9번, 15번 인덱스의 "a"는 소문자이므로 전부 대문자로 고쳐줍니다.
다른 문자들은 전부 "a"가 아닌 소문자이므로 바꾸지 않습니다.
따라서 "AbstrAct AlgebrA"를 return 합니다.

입출력 예 #2
0번, 2번, 4번, 6번, 8번, 10번 인덱스의 문자들은 "A"가 아닌 대문자이므로 전부 소문자로 고쳐줍니다.
5번 인덱스의 "a"는 소문자이므로 대문자로 고쳐줍니다.
다른 문자들은 전부 "a"가 아닌 소문자이므로 바꾸지 않습니다.
따라서 "progrAmmers"를 return 합니다.


=============================================================================================
ANSWER

class Solution {
    public String solution(String myString) {
        myString = myString.toLowerCase();
        myString = myString.replaceAll("a", "A");
        return myString;
    }
}


문제해설
문자열을 소문자로 바꾼 후에 'a'를 'A'로 대체하여 반환
-toLowerCase(): 문자열의 모든 문자를 소문자로 변환
-replaceAll(String regex, String replacement): 어진 정규 표현식(regex)과 일치하는 부분을 주어진 대체 문자열(replacement)로 대체합니다

============================
처음 생각한 방식
class Solution {
    public String solution(String myString) {
        char[] charArray = myString.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'a') {
                charArray[i] = Character.toUpperCase(charArray[i]);
            } else if (Character.isUpperCase(charArray[i])) {
                charArray[i] = Character.toLowerCase(charArray[i]);
            }
        }

        return new String(charArray);
    }
}