[English](./README-EN.md) | [简体中文](./README.md)

# Vibe LibreOJ

<div align="center">

🤖 **AI 驱动的 LibreOJ 题目抓取与解题工具**

[![License](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)
[![LibreOJ](https://img.shields.io/badge/LibreOJ-loj.ac-green.svg)](https://loj.ac)
[![Language](https://img.shields.io/badge/Language-C-lightgrey.svg)](https://en.wikipedia.org/wiki/C_(programming_language))
[![Language](https://img.shields.io/badge/Language-C++-orange.svg)](https://isocpp.org/)
[![Language](https://img.shields.io/badge/Language-Python-yellow.svg)](https://python.org/)
[![Language](https://img.shields.io/badge/Language-Java-red.svg)](https://www.java.com/)
[![Language](https://img.shields.io/badge/Language-Kotlin-purple.svg)](https://kotlinlang.org/)
[![Language](https://img.shields.io/badge/Language-Pascal-teal.svg)](https://www.freepascal.org/)
[![Language](https://img.shields.io/badge/Language-Rust-brown.svg)](https://www.rust-lang.org/)
[![Language](https://img.shields.io/badge/Language-Go-cyan.svg)](https://golang.org/)
[![Language](https://img.shields.io/badge/Language-Haskell-5e5086.svg)](https://www.haskell.org/)
[![Language](https://img.shields.io/badge/Language-C%23-239120.svg)](https://docs.microsoft.com/dotnet/csharp/)
[![Language](https://img.shields.io/badge/Language-F%23-378bba.svg)](https://fsharp.org/)

</div>

---

## 📖 简介

**Vibe LibreOJ** 是一个基于 AI Agent 的自动化工作流项目，能够自动抓取 [LibreOJ](https://loj.ac) 上的题目信息，并智能生成 C、C++、C#、Python、Java、Kotlin、Pascal、Rust、Go、Haskell 和 F# 解答代码。

该项目利用 Chrome DevTools MCP 协议读取题面，自动整理为规范的 Markdown 格式，并根据题目要求生成可通过的多语言解法。

## ✨ 功能特性

- 🔗 **灵活的输入解析** — 支持多种输入格式：`loj1`、`loj001`、`https://loj.ac/p/1` 等
- 📄 **自动题面抓取** — 通过 Chrome DevTools MCP 自动读取并保存题目内容
- 📝 **Markdown 格式化** — 题目信息自动整理为结构化的 Markdown 文件
- 💻 **多语言代码生成** — AI 分析题意并生成 C11、C++11、C# 9、Python 3、Java 8、Kotlin 1.8、Pascal、Rust、Go、Haskell 和 F# 5.0 的解答代码
- 📁 **规范目录结构** — 每道题目独立目录，便于管理和查阅

## 🚀 快速开始

### 使用方式

只需向 AI Agent 输入题号或题目链接，即可自动完成以下工作流程：

```
# 支持的输入格式
loj1
loj001  
https://loj.ac/p/1
http://loj.ac/p/123
```

### 输出结构

每道题目将在独立文件夹中生成以下文件：

```
loj/<题号>/
├── problem.md     # 题面描述（Markdown 格式）
├── solution.c     # 解答代码（C11）
├── solution.cpp   # 解答代码（C++11）
├── solution.cs    # 解答代码（C# 9）
├── solution.fs    # 解答代码（F# 5.0）
├── solution.py    # 解答代码（Python 3）
├── solution.java  # 解答代码（Java 8）
├── solution.kt    # 解答代码（Kotlin 1.8）
├── solution.pas   # 解答代码（Pascal）
├── solution.rs    # 解答代码（Rust 2021）
├── solution.go    # 解答代码（Go 1.x）
└── solution.hs    # 解答代码（Haskell 2010）
```

## 📂 项目结构

```
Vibe Libre OJ/
├── README.md           # 项目说明文档（中文）
├── README-EN.md        # 项目说明文档（英文）
├── LICENSE             # MIT 许可证
├── vloj/
│   └── SKILL.md        # AI 工作流技能定义
├── web/                # Landing Page（Astro）
│   ├── src/
│   └── package.json
└── loj/                # 题目解答目录
    └── <题号>/
        ├── problem.md      # 题面
        ├── solution.c      # C 解答
        ├── solution.cpp    # C++ 解答
        ├── solution.cs     # C# 解答
        ├── solution.fs     # F# 解答
        ├── solution.py     # Python 解答
        ├── solution.java   # Java 解答
        ├── solution.kt     # Kotlin 解答
        ├── solution.pas    # Pascal 解答
        ├── solution.rs     # Rust 解答
        ├── solution.go     # Go 解答
        └── solution.hs     # Haskell 解答
```

## 📋 工作流程

1. **解析输入** — 从用户输入中提取题号，去除前导零
2. **创建目录** — 在工作区 `loj/` 目录下创建以题号命名的文件夹
3. **抓取题面** — 使用 Chrome DevTools MCP 访问题目页面，获取题目内容
4. **保存题面** — 将题目信息格式化为 Markdown 并保存为 `problem.md`
5. **生成解答** — AI 分析题目，分别编写 C、C++、C#、Python、Java、Kotlin、Pascal、Rust、Go、Haskell 和 F# 解答代码

## 💡 示例

以第 1 题「A + B 问题」为例：

**problem.md**
```markdown
# 1 A + B 问题
原始URL: https://loj.ac/p/1

## 题目描述
输入 a 和 b，输出 a + b 的结果。

## 输入格式
一行两个正整数 a 和 b。

## 输出格式
一行一个正整数 a + b。
```

**solution.c**
```c
// 思路：读取两个整数，输出它们的和。
// 复杂度：时间 O(1)，空间 O(1)。
#include <stdio.h>

int main(void) {
    long long a, b;
    if (scanf("%lld %lld", &a, &b) != 2) return 0;
    printf("%lld", a + b);
    return 0;
}
```

**solution.cpp**
```cpp
// 思路：直接读取 a、b，输出 a + b。
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
```

**solution.py**
```python
# 思路：直接读取 a、b，输出 a + b。
# 复杂度：时间 O(1)，空间 O(1)。

a, b = map(int, input().split())
print(a + b)
```

**solution.java**
```java
// 思路：读取两个整数 a、b，输出 a + b。
// 复杂度：时间 O(1)，空间 O(1)。
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.print(a + b);
    }
}
```

**solution.kt**
```kotlin
// 思路：直接读取两个整数相加输出。
// 复杂度：时间 O(1)，空间 O(1)。

fun main() {
    val (a, b) = readln().split(" ").map { it.toLong() }
    print(a + b)
}
```

**solution.pas**
```pascal
{ 思路：直接读入两个整数并输出它们的和。 }
{ 复杂度：时间 O(1)，空间 O(1)。 }
program Main;

var
  a, b: Int64;
begin
  if not EOF(Input) then
  begin
    Read(a, b);
    Write(a + b);
  end;
end.
```

**solution.rs**
```rust
// 思路：直接读取两个整数并输出其和。
// 复杂度：时间 O(1)，空间 O(1)。
use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    let mut it = input.split_whitespace();
    if let (Some(a), Some(b)) = (it.next(), it.next()) {
        let a: i64 = a.parse().unwrap();
        let b: i64 = b.parse().unwrap();
        print!("{}", a + b);
    }
}
```

**solution.go**
```go
// 思路：直接读入 a 和 b，输出 a+b。
// 复杂度：O(1)
package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	inin := bufio.NewReader(os.Stdin)
	var a, b int64
	if _, err := fmt.Fscan(in, &a, &b); err != nil {
		return
	}
	out := bufio.NewWriter(os.Stdout)
	fmt.Fprintln(out, a+b)
	out.Flush()
}
```

**solution.hs**
```haskell
-- 思路：直接读取两个整数并输出其和。
-- 复杂度：时间 O(1)，空间 O(1)。

main :: IO ()
main = do
  line <- getLine
  let [a, b] = map read (words line) :: [Integer]
  print (a + b)
```

**solution.cs**
```csharp
// 思路：直接读取两个整数并输出其和。
// 复杂度：时间 O(1)，空间 O(1)。
using System;

class Program
{
    static void Main()
    {
        var parts = Console.ReadLine().Split();
        long a = long.Parse(parts[0]);
        long b = long.Parse(parts[1]);
        Console.Write(a + b);
    }
}
```

**solution.fs**
```fsharp
// 思路：读取两个整数 a、b，输出 a+b。
// 复杂度：时间 O(1)，空间 O(1)。
open System

[<EntryPoint>]
let main _ =
    let input = Console.In.ReadToEnd()
    if String.IsNullOrWhiteSpace(input) then 0 else
    let parts = input.Split([| ' '; '\n'; '\r'; '\t' |], StringSplitOptions.RemoveEmptyEntries)
    if parts.Length < 2 then 0 else
    let a = int64 parts.[0]
    let b = int64 parts.[1]
    printf "%d" (a + b)
    0
```

## 🛠️ 技术栈

- **AI Agent** — 智能工作流控制
- **Chrome DevTools MCP** — 网页内容抓取
- **C11** — 解答代码标准
- **C++11** — 解答代码标准
- **C# 9** — 解答代码标准
- **F# 5.0** — 解答代码标准
- **Python 3** — 解答代码标准
- **Java 8** — 解答代码标准
- **Kotlin 1.8** — 解答代码标准
- **Free Pascal 3.2** — 解答代码标准
- **Rust 2021** — 解答代码标准
- **Go 1.x** — 解答代码标准
- **Haskell 2010** — 解答代码标准
- **Markdown** — 题目格式化

## 📄 许可证

本项目采用 [MIT 许可证](LICENSE) 开源。

## 🔗 相关链接

- [LibreOJ](https://loj.ac) — 自由的在线评测系统
- [Chrome DevTools Protocol](https://chromedevtools.github.io/devtools-protocol/) — Chrome 开发者工具协议

---

<div align="center">

**Made with ❤️ by AI Agent**

</div>