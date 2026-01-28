// 思路：直接读取两个整数相加输出。
// 复杂度：时间 O(1)，空间 O(1)

import java.io.BufferedInputStream;
import java.io.IOException;

public class Main {
    private static int read() throws IOException {
        return System.in.read();
    }

    public static void main(String[] args) throws Exception {
        BufferedInputStream in = new BufferedInputStream(System.in);
        long a = 0, b = 0;
        int c;
        boolean neg = false;

        // 读取 a
        while ((c = in.read()) != -1 && c <= ' ') {}
        if (c == '-') { neg = true; c = in.read(); }
        while (c > ' ') {
            a = a * 10 + (c - '0');
            c = in.read();
        }
        if (neg) a = -a;

        // 读取 b
        neg = false;
        while ((c = in.read()) != -1 && c <= ' ') {}
        if (c == '-') { neg = true; c = in.read(); }
        while (c > ' ') {
            b = b * 10 + (c - '0');
            c = in.read();
        }
        if (neg) b = -b;

        System.out.print(a + b);
    }
}
