import kotlin.test.Test
import kotlin.test.assertEquals

internal class SolutionTest {
    private val solution: Solution = Solution()
    @Test
    fun isPowerOfTwoExample1() {
        val result = solution.isPowerOfTwo(1)
        assertEquals(true, result)
    }
    @Test
    fun isPowerOfTwoExample2() {
        val result = solution.isPowerOfTwo(16)
        assertEquals(true, result)
    }
    @Test
    fun isPowerOfTwoExample3() {
        val result = solution.isPowerOfTwo(3)
        assertEquals(false, result)
    }
    @Test
    fun isPowerOfTwoExample4() {
        val result = solution.isPowerOfTwo(1024)
        assertEquals(true, result)
    }
}