# 思路：直接读入两个整数并输出它们的和。
# 复杂度：时间 O(1)，空间 O(1)。
import sys


def main() -> None:
    data = sys.stdin.read().strip().split()
    if len(data) < 2:
        return
    a, b = map(int, data[:2])
    sys.stdout.write(str(a + b))


if __name__ == "__main__":
    main()
