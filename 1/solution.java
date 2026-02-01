// 思路：直接读入 a 和 b，输出 a+b。
// 复杂度：O(1)
import java.io.*;

public class Main {
    private static final class FastScanner {
        private final InputStream in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        FastScanner(InputStream in) {
            this.in = in;
        }

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        long nextLong() throws IOException {
            int c;
            do {
                c = read();
                if (c == -1) return Long.MIN_VALUE;
            } while (c <= ' ');
            int sign = 1;
            if (c == '-') {
                sign = -1;
                c = read();
            }
            long val = 0;
            while (c > ' ') {
                val = val * 10 + (c - '0');
                c = read();
            }
            return val * sign;
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        long a = fs.nextLong();
        if (a == Long.MIN_VALUE) return;
        long b = fs.nextLong();
        if (b == Long.MIN_VALUE) return;
        StringBuilder sb = new StringBuilder();
        sb.append(a + b).append('\n');
        System.out.print(sb.toString());
    }
}
