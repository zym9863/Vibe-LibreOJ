#include <stdio.h>

int main(void) {
    freopen("copycat.in", "r", stdin);
    freopen("copycat.out", "w", stdout);

    int t;
    if (scanf("%d", &t) != 1) return 0;

    char a[1105];
    for (int i = 0; i < t && scanf("%1104s", a) == 1; ++i) {
        fputs(a, stdout);
        if (i + 1 < t) fputc('\n', stdout);
    }
    return 0;
}

