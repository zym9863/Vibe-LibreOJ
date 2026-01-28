// 思路：直接读取两个整数相加输出。
// 复杂度：时间 O(1)，空间 O(1)

#include <stdio.h>

int main(void) {
    long long a, b;
    if (scanf("%lld %lld", &a, &b) != 2) {
        return 0;
    }
    printf("%lld\n", a + b);
    return 0;
}
