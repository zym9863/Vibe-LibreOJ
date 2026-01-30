# 思路：直接读取两个整数并输出其和。
# 复杂度：时间 O(1)，空间 O(1)。
import sys

data = sys.stdin.read().strip().split()
if len(data) >= 2:
    a = int(data[0])
    b = int(data[1])
    sys.stdout.write(str(a + b))
