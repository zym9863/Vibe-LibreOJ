[English](./README-EN.md) | [简体中文](./README.md)

# Vibe LibreOJ

<div align="center">

🤖 **AI-powered LibreOJ problem scraper and solution tool**

[![License](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)
[![LibreOJ](https://img.shields.io/badge/LibreOJ-loj.ac-green.svg)](https://loj.ac)
[![Language](https://img.shields.io/badge/Language-C++-orange.svg)](https://isocpp.org/)

</div>

---

## 📖 Introduction

**Vibe LibreOJ** is an automated workflow project based on AI Agents, capable of automatically scraping problem information from [LibreOJ](https://loj.ac) and intelligently generating C++ solution code.

This project utilizes the Chrome DevTools MCP protocol to read problem statements, automatically organizing them into standard Markdown format, and generating passable C++ solutions based on the problem requirements.

## ✨ Features

- 🔗 **Flexible Input Parsing** — Supports various input formats: `loj1`, `loj001`, `https://loj.ac/p/1`, etc.
- 📄 **Automatic Problem Scraping** — Automatically reads and saves problem content via Chrome DevTools MCP.
- 📝 **Markdown Formatting** — Problem information is automatically organized into structured Markdown files.
- 💻 **Intelligent Code Generation** — AI analyzes the problem and generates C++11 standard solution code.
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
└── solution.cpp   # Solution code (C++11)
```

## 📂 Project Structure

```
Vibe LibreOJ/
├── README.md           # Project documentation (Chinese)
├── README-EN.md        # Project documentation (English)
├── vloj/
│   └── SKILL.md        # AI workflow skill definition
└── <Problem ID>/       # Problem solution directory
    ├── problem.md      # Problem statement
    └── solution.cpp    # Solution
```

## 📋 Workflow

1. **Parse Input** — Extract problem number from user input, removing leading zeros.
2. **Create Directory** — Create a folder named after the problem number in the workspace root.
3. **Scrape Problem** — Visit the problem page using Chrome DevTools MCP to capture problem content.
4. **Save Problem** — Format problem information into Markdown and save as `problem.md`.
5. **Generate Solution** — AI analyzes the problem, writes C++ solution code, and saves it as `solution.cpp`.

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

## 🛠️ Tech Stack

- **AI Agent** — Intelligent workflow control
- **Chrome DevTools MCP** — Web content scraping
- **C++11** — Solution code standard
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
