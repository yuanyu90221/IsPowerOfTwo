import kotlin.math.pow
class Solution {
    fun isPowerOfTwo(n: Int): Boolean {
       return n == 2.toFloat().pow((n.countTrailingZeroBits())).toInt()
    }
}