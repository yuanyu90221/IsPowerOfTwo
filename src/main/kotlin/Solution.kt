//import kotlin.math.pow
class Solution {
    fun isPowerOfTwo(n: Int): Boolean {
//       return n == 2.toFloat().pow((n.countTrailingZeroBits())).toInt()
        if (n <= 0)
            return false
        return (n and (n-1)) == 0
    }
}