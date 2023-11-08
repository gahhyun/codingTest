문제 설명
정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 

단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 

예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.

제한 조건
arr은 길이 1 이상인 배열입니다.
인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.
입출력 예
arr             return
[4,3,2,1]    [4,3,2]
[10]           [-1]

============================================================

ANSWER

class Solution {
    public int[] solution(int[] arr) {

        1. 배열 길이가 1인 경우
        if(arr.length == 1){
            int[] answer = {-1};
            return answer;
        }
        
        2. 배열길이가 1보다 클 때
        -가장 작은 수를 뺀 길이로 초기화
        int[] answer = new int[arr.length-1];
        
        int min = arr[0]; //하나의 값을 기준으로 잡음.
        -제일 작은 수를 구한다.
        for(int i=1; i<arr.length; i++){
            min = Math.min(min, arr[i]);   -> Math.min은 가장 작은수를 return
        }
        
        -반복문 index 용
        int index = 0;
        
        - 가장 작은 수를 제외한 배열 만들기
        for(int i=0; i<arr.length; i++){
            - 배열의 값이 가장 작은 수라면
            if(arr[i] == min){
                - continue를 이용해 배열에 넣지 않고 넘어간다.
                continue;
            }
            answer[index++] = arr[i];
        }
        
        return answer;
    }
}