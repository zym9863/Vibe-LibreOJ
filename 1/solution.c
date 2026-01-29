// 思路：直接读入两个整数并输出它们的和。
// 复杂度：时间 O(1)，空间 O(1)。
#include <stdio.h>

int main(void) {
    long long a, b;
    if (scanf("%lld%lld", &a, &b) != 2) return 0;
    printf("%lld", a + b);
    return 0;
}
