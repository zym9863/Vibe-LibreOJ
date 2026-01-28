// 思路：直接读取两个整数相加输出。
// 复杂度：时间 O(1)，空间 O(1)

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
        while (c <= 32 && c >= 0) c = readByte()
        if (c < 0) return null
        var sign = 1
        if (c == '-'.code) {
            sign = -1
            c = readByte()
        }
        var res = 0L
        while (c > 32) {
            res = res * 10 + (c - '0'.code)
            c = readByte()
        }
        return res * sign
    }
}

fun main() {
    val fs = FastScanner()
    val a = fs.nextLong() ?: return
    val b = fs.nextLong() ?: return
    print(a + b)
}
