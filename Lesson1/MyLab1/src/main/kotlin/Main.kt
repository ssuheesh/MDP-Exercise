package com.sukhee.miu

fun main() {
    val scores: ByteArray = byteArrayOf(90, 91, 93)
    val alphabets: CharArray = charArrayOf('a', 'b', 'c', 'd')
    val rank: ShortArray = shortArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val numbers: IntArray = intArrayOf(1, 2, 3, 4, 5)
    val mountainHeights: LongArray = longArrayOf(202, 10456)
    val waterLevel: FloatArray = floatArrayOf(1.0f, 2.0f, 3.0f)
    val climate: DoubleArray = doubleArrayOf(70.2, 80.3)
    println(scores.contentToString())
    println(alphabets.contentToString())
    println(rank.contentToString())
    println(numbers.contentToString())
    println(mountainHeights.contentToString())
    println(waterLevel.contentToString())
    println(climate.contentToString())

    val nums: ByteArray = byteArrayOf(90, 91, 93)
    println(nums.contentToString())

    var courseName: String = "mobile device programming";
    println(courseName?.uppercase()) // ?.

    var car: String? = null
    car = "tesla"
    println(car?.uppercase() ?: "No car")
    println(car!!.length) // if null throws exception, use it when car must not be null

}