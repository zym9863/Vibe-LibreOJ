// 思路：读取两个整数，输出它们的和。
// 复杂度：O(1) 时间，O(1) 空间。
#include <iostream>

int main() {
    std::ios::sync_with_stdio(false);
    std::cin.tie(nullptr);

    long long a, b;
    if (!(std::cin >> a >> b)) {
        return 0;
    }
    std::cout << (a + b);
    return 0;
}
