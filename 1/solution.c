// 思路：读取两个整数 a, b，输出 a + b。
// 复杂度：时间 O(1)，空间 O(1)。
#include <stdio.h>

int main(void) {
    long long a, b;
    if (scanf("%lld %lld", &a, &b) != 2) {
        return 0;
    }
    printf("%lld", a + b);
    return 0;
}
