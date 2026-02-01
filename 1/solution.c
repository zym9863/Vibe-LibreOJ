// 思路：直接读入 a 和 b，输出 a+b。
// 复杂度：O(1)
#include <stdio.h>

int main(void) {
    long long a, b;
    if (scanf("%lld %lld", &a, &b) != 2) return 0;
    printf("%lld\n", a + b);
    return 0;
}
