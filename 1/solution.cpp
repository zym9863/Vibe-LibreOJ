// 思路：直接读取两个整数相加输出。
// 复杂度：时间 O(1)，空间 O(1)

#include <iostream>

int main() {
    long long a, b;
    if (!(std::cin >> a >> b)) {
        return 0;
    }
    std::cout << (a + b) << "\n";
    return 0;
}
