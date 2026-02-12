import java.io.File

private class FastScanner(private val data: ByteArray) {
    private var idx = 0

    fun next(): String? {
        while (idx < data.size && data[idx].toInt() <= 32) idx++
        if (idx >= data.size) return null
        val start = idx
        while (idx < data.size && data[idx].toInt() > 32) idx++
        return String(data, start, idx - start)
    }
}

fun main() {
    val inputFile = File("copycat.in")
    if (!inputFile.exists()) {
        File("copycat.out").writeText("")
        return
    }

    val fs = FastScanner(inputFile.readBytes())
    val t = fs.next()?.toIntOrNull() ?: run {
        File("copycat.out").writeText("")
        return
    }

    val out = StringBuilder()
    for (i in 0 until t) {
        val a = fs.next() ?: break
        out.append(a)
        if (i + 1 < t) out.append('\n')
    }

    File("copycat.out").writeText(out.toString())
}

