#include <bits/stdc++.h>
using namespace std;

int main() {
    freopen("copycat.in", "r", stdin);
    freopen("copycat.out", "w", stdout);

    int t;
    if (!(cin >> t)) return 0;

    string a;
    for (int i = 0; i < t && (cin >> a); ++i) {
        cout << a;
        if (i + 1 < t) cout << '\n';
    }
    return 0;
}

