// 思路：直接读入两个整数并输出它们的和。
// 复杂度：时间 O(1)，空间 O(1)。
#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    long long a, b;
    if (!(cin >> a >> b)) return 0;
    cout << a + b;
    return 0;
}
