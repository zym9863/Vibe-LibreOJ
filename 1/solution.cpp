// 思路：直接读入 a 和 b，输出 a+b。
// 复杂度：O(1)
#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    long long a, b;
    if (!(cin >> a >> b)) return 0;
    cout << (a + b) << "\n";
    return 0;
}
