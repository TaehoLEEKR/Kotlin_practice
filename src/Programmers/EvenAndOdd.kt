package Programmers

fun main(){

//    Solution1().solution(0);
//    Solution2().solution(intArrayOf(1,2,3,4));
//    Solution3().solution(2,5);
}
class Solution1 {
    fun solution(num: Int): String {
        var answer = ""
        answer = if (num % 2 == 0) "EVEN" else "ODD"
        return answer
    }
}

class Solution2 {
    fun solution(arr: IntArray): Double {
        var answer = arr.sum().toDouble() / arr.size;
        println(arr.sum())
        println(arr.size)
        println(answer);
        return Double.POSITIVE_INFINITY;
    }
}


//class Solution3 {
//    fun solution(x: Int, n: Int): LongArray {
//        var answer = MutableList<Long>()
//
//            for(i in x..x*n step x){
//                answer.add(i.toLong())
//        }
//        return answer.toLongArray()
//    }
//}