// 思路：读入两个整数 a、b，输出 a + b。
// 复杂度：时间 O(1)，空间 O(1)。
#include <bits/stdc++.h>

int main() {
    long long a, b;
    if (!(std::cin >> a >> b)) return 0;
    std::cout << a + b;
    return 0;
}
