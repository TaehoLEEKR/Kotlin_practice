package practice

fun main(){

    for(i in 1..10){
        println(i)
    } // 01234...9

    for(i in 1..10 step 2){
        println(i)
    } // 0 3 6 9

    for(i in 9 downTo 0){
        println(i)
    }

    for(i in 10 downTo 0 step 2){
        println(i)
    }

    for (i in 0 until 5) { // 'until'은 마지막 값을 포함하지 않음
        println(i)
    } // 0 1 2 3 4

    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (i in numbers.filter { it % 2 == 0 }) { // 짝수만 출력
        println(i)
    } // 2 4 6 8 10

    // 리스트와 인덱스를 동시에 사용
    val fruits = listOf("Apple", "Banana", "Cherry")
    for ((index, fruit) in fruits.withIndex()) {
        println("Index $index: $fruit")
    }
    // Index 0: Apple
    // Index 1: Banana
    // Index 2: Cherry

    val emptyList = listOf<String>()
    for (i in emptyList) {
        println(i) // 실행되지 않음
    }

    val arr = arrayOf(10, 20, 30, 40)
    for (i in arr) {
        println(i)
    } // 10 20 30 40

    for (i in 10 downTo 1) { // 10부터 1까지
        println(i)
    } //  10 9 8 7 ... 1

    for (i in 10 downTo 1 step 3) { // 3씩 감소
        println(i)
    } // : 10 7 4 1

    for (i in 1..10) {
        if (i == 5) break // 루프를 종료
        if (i % 2 == 0) continue // 이 조건에 맞을 경우 아래 코드 건너뜀
        println(i)
    } // 1 3

    fruits.forEachIndexed { index, fruit ->
        println("Index $index: $fruit")
    }
}