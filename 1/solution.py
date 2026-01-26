# 思路：读取两个整数 a, b，输出 a + b。
# 复杂度：时间 O(1)，空间 O(1)。
import sys

def main() -> None:
    data = sys.stdin.read().strip().split()
    if len(data) < 2:
        return
    a = int(data[0])
    b = int(data[1])
    sys.stdout.write(str(a + b))

if __name__ == "__main__":
    main()
