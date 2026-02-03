// 思路：读入两个整数 a、b，输出 a + b。
// 复杂度：时间 O(1)，空间 O(1)。
import java.io.BufferedInputStream

private class FastScanner {
    private val input = BufferedInputStream(System.`in`)
    private val buffer = ByteArray(1 shl 16)
    private var len = 0
    private var ptr = 0

    private fun readByte(): Int {
        if (ptr >= len) {
            len = input.read(buffer)
            ptr = 0
            if (len <= 0) return -1
        }
        return buffer[ptr++].toInt()
    }

    fun nextLong(): Long? {
        var c = readByte()
        while (c <= 32) {
            if (c == -1) return null
            c = readByte()
        }
        var sign = 1
        if (c == '-'.code) {
            sign = -1
            c = readByte()
        }
        var valNum = 0L
        while (c > 32 && c != -1) {
            valNum = valNum * 10 + (c - '0'.code)
            c = readByte()
        }
        return valNum * sign
    }
}

fun main() {
    val fs = FastScanner()
    val a = fs.nextLong() ?: return
    val b = fs.nextLong() ?: return
    print(a + b)
}
