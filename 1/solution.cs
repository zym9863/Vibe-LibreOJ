// 思路：读入两个整数 a、b，输出 a + b。
// 复杂度：时间 O(1)，空间 O(1)。
using System;

class Program {
    static void Main() {
        string input = Console.In.ReadToEnd();
        if (string.IsNullOrWhiteSpace(input)) return;
        var parts = input.Split((char[])null, StringSplitOptions.RemoveEmptyEntries);
        if (parts.Length < 2) return;
        long a = long.Parse(parts[0]);
        long b = long.Parse(parts[1]);
        Console.Write(a + b);
    }
}
