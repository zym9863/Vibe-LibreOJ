// 思路：直接读取两个整数并输出其和。
// 复杂度：时间 O(1)，空间 O(1)。
import java.io.BufferedInputStream;
import java.io.IOException;

public class Main {
    private static class FastScanner {
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        private int read() throws IOException {
            if (ptr >= len) {
                len = System.in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        long nextLong() throws IOException {
            int c;
            do {
                c = read();
            } while (c <= ' ' && c != -1);
            long sign = 1;
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
        System.setIn(new BufferedInputStream(System.in));
        FastScanner fs = new FastScanner();
        long a = fs.nextLong();
        long b = fs.nextLong();
        long sum = a + b;
        System.out.print(sum);
    }
}
