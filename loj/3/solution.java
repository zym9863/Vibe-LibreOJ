import java.io.*;

public class Main {
    private static final class FastScanner {
        private final InputStream in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0;
        private int len = 0;

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

        String next() throws IOException {
            int c;
            while ((c = read()) != -1 && c <= 32) {
                // Skip whitespace.
            }
            if (c == -1) return null;
            StringBuilder sb = new StringBuilder();
            do {
                sb.append((char) c);
                c = read();
            } while (c != -1 && c > 32);
            return sb.toString();
        }
    }

    public static void main(String[] args) throws Exception {
        InputStream input;
        try {
            input = new FileInputStream("copycat.in");
        } catch (FileNotFoundException e) {
            try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("copycat.out")))) {
                out.print("");
            }
            return;
        }

        try (InputStream in = input;
             PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("copycat.out")))) {
            FastScanner fs = new FastScanner(in);
            String first = fs.next();
            if (first == null) return;
            int t = Integer.parseInt(first);
            for (int i = 0; i < t; i++) {
                String a = fs.next();
                if (a == null) break;
                out.print(a);
                if (i + 1 < t) out.print('\n');
            }
        }
    }
}
