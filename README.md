# IsPowerOfTwo

 寫一個 method 判斷輸入的數是否為 2的次方數
 
## 我的解法

因為 如果是2的次方數 代表 只有一個 bit是 1 其他都是 0

舉例來說： 
         
     2 ^ 0 = 1 = 0b1

     2 ^ 4 = 16 = 0b1000
     
     2 ^ 10 = 1024 = 0b1000000000

     1025 = 0b1000000001

所以只要找到 最右邊第1個 非零的 bit

驗證 n ==  2 ^ (n 第一個非零bit位置 即可)

```kotlin
import kotlin.math.pow
class Solution {
    fun isPowerOfTwo(n: Int): Boolean {
       return n == 2.toFloat().pow((n.countTrailingZeroBits())).toInt()
    }
}
```