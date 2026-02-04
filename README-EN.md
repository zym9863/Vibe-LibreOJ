[English](./README-EN.md) | [简体中文](./README.md)

# Vibe LibreOJ

<div align="center">

🤖 **AI-powered LibreOJ problem scraper and solution tool**

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

## 📖 Introduction

**Vibe LibreOJ** is an automated workflow project based on AI Agents, capable of automatically scraping problem information from [LibreOJ](https://loj.ac) and intelligently generating C, C++, C#, Python, Java, Kotlin, Pascal, Rust, Go, Haskell and F# solution code.

This project utilizes the Chrome DevTools MCP protocol to read problem statements, automatically organizing them into standard Markdown format, and generating passable multi-language solutions based on the problem requirements.

## ✨ Features

- 🔗 **Flexible Input Parsing** — Supports various input formats: `loj1`, `loj001`, `https://loj.ac/p/1`, etc.
- 📄 **Automatic Problem Scraping** — Automatically reads and saves problem content via Chrome DevTools MCP.
- 📝 **Markdown Formatting** — Problem information is automatically organized into structured Markdown files.
- 💻 **Multi-language Code Generation** — AI analyzes the problem and generates C11, C++11, C# 9, Python 3, Java 8, Kotlin 1.8, Pascal, Rust, Go, Haskell and F# 5.0 solution code.
- 📁 **Standardized Directory Structure** — Each problem has its own independent directory for easy management and reference.

## 🚀 Quick Start

### Usage

Simply input the problem number or link to the AI Agent to automatically complete the following workflow:

```
# Supported input formats
loj1
loj001  
https://loj.ac/p/1
http://loj.ac/p/123
```

### Output Structure

Each problem will have the following files generated in an independent folder:

```
<Problem ID>/
├── problem.md     # Problem statement description (Markdown format)
├── solution.c     # Solution code (C11)
├── solution.cpp   # Solution code (C++11)
├── solution.cs    # Solution code (C# 9)
├── solution.fs    # Solution code (F# 5.0)
├── solution.py    # Solution code (Python 3)
├── solution.java  # Solution code (Java 8)
├── solution.kt    # Solution code (Kotlin 1.8)
├── solution.pas   # Solution code (Pascal)
├── solution.rs    # Solution code (Rust 2021)
├── solution.go    # Solution code (Go 1.x)
└── solution.hs    # Solution code (Haskell 2010)
```

## 📂 Project Structure

```
Vibe LibreOJ/
├── README.md           # Project documentation (Chinese)
├── README-EN.md        # Project documentation (English)
├── LICENSE             # MIT License
├── vloj/
│   └── SKILL.md        # AI workflow skill definition
└── <Problem ID>/       # Problem solution directory
    ├── problem.md      # Problem statement
    ├── solution.c      # C solution
    ├── solution.cpp    # C++ solution
    ├── solution.cs     # C# solution
    ├── solution.fs     # F# solution
    ├── solution.py     # Python solution
    ├── solution.java   # Java solution
    ├── solution.kt     # Kotlin solution
    ├── solution.pas    # Pascal solution
    ├── solution.rs     # Rust solution
    ├── solution.go     # Go solution
    └── solution.hs     # Haskell solution
```

## 📋 Workflow

1. **Parse Input** — Extract problem number from user input, removing leading zeros.
2. **Create Directory** — Create a folder named after the problem number in the workspace root.
3. **Scrape Problem** — Visit the problem page using Chrome DevTools MCP to capture problem content.
4. **Save Problem** — Format problem information into Markdown and save as `problem.md`.
5. **Generate Solution** — AI analyzes the problem and writes C, C++, C#, Python, Java, Kotlin, Pascal, Rust, Go, Haskell and F# solution code respectively.

## 💡 Example

Taking Problem 1 "A + B Problem" as an example:

**problem.md**
```markdown
# 1 A + B Problem
Original URL: https://loj.ac/p/1

## Problem Description
Input a and b, output the result of a + b.

## Input Format
Two positive integers a and b in one line.

## Output Format
One positive integer a + b in one line.
```

**solution.c**
```c
// Logic: Read two integers and output their sum.
// Complexity: Time O(1), Space O(1).
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
// Logic: Directly read a and b, output a + b.
// Complexity: Time O(1), Space O(1).
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
# Logic: Directly read a and b, output a + b.
# Complexity: Time O(1), Space O(1).

a, b = map(int, input().split())
print(a + b)
```

**solution.java**
```java
// Logic: Read two integers a and b, output a + b.
// Complexity: Time O(1), Space O(1).
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
// Logic: Directly read two integers and output their sum.
// Complexity: Time O(1), Space O(1).

fun main() {
    val (a, b) = readln().split(" ").map { it.toLong() }
    print(a + b)
}
```

**solution.pas**
```pascal
{ Logic: Directly read two integers and output their sum. }
{ Complexity: Time O(1), Space O(1). }
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
// Logic: Directly read two integers and output their sum.
// Complexity: Time O(1), Space O(1).
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
// Logic: Directly read a and b, output a+b.
// Complexity: O(1)
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
-- Logic: Directly read two integers and output their sum.
-- Complexity: Time O(1), Space O(1).

main :: IO ()
main = do
  line <- getLine
  let [a, b] = map read (words line) :: [Integer]
  print (a + b)
```

**solution.cs**
```csharp
// Logic: Directly read two integers and output their sum.
// Complexity: Time O(1), Space O(1).
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
// Logic: Read two integers a and b, output a+b.
// Complexity: Time O(1), Space O(1).
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

## 🛠️ Tech Stack

- **AI Agent** — Intelligent workflow control
- **Chrome DevTools MCP** — Web content scraping
- **C11** — Solution code standard
- **C++11** — Solution code standard
- **C# 9** — Solution code standard
- **F# 5.0** — Solution code standard
- **Python 3** — Solution code standard
- **Java 8** — Solution code standard
- **Kotlin 1.8** — Solution code standard
- **Free Pascal 3.2** — Solution code standard
- **Rust 2021** — Solution code standard
- **Go 1.x** — Solution code standard
- **Haskell 2010** — Solution code standard
- **Markdown** — Problem formatting

## 📄 License

This project is open-source under the [MIT License](LICENSE).

## 🔗 Related Links

- [LibreOJ](https://loj.ac) — A free online judge system
- [Chrome DevTools Protocol](https://chromedevtools.github.io/devtools-protocol/) — Chrome DevTools Protocol

---

<div align="center">

**Made with ❤️ by AI Agent**

</div>