//package Programmers
//
//fun main(){
//    Solution().solution(1234);
//    Solution().mySolution(123);
//}
//class Solution {
//    fun solution(n: Int): Int {
//        var answer = 0
//
//        answer = (0..n.toString().length-1)
//            .filter{n.toString()[it].isDigit()}.count()
//
//        return answer
//    }
//
//    fun mySolution(n: Int): Int {
//        var answer = 0;
//
//        for (i in n.toString()) {
//            println(i.digitToInt());
//            answer += i.digitToInt();
//        }
//        print(answer);
//        return answer;
//    }
//}