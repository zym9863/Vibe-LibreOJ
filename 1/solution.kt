// 思路：直接读入 a 和 b，输出 a+b。
// 复杂度：O(1)
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
        var c: Int
        do {
            c = readByte()
            if (c == -1) return null
        } while (c <= 32)
        var sign = 1
        if (c == '-'.code) {
            sign = -1
            c = readByte()
        }
        var valNum = 0L
        while (c > 32) {
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
