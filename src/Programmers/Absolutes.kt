//package Programmers
//
//fun main(){
//    Solution().solution(intArrayOf(1,2,3,4,5), booleanArrayOf(true,true,true,true,false))
//}
//
//class Solution {
//    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
//        var answer = 0;
//        answer = absolutes.mapIndexed {idx , value ->
//            if(signs[idx]) value else -value
//        }.sum()
//
//        return answer;
//    }
//}