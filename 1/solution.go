// 思路：直接读入 a 和 b，输出 a+b。
// 复杂度：O(1)
package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	in := bufio.NewReader(os.Stdin)
	var a, b int64
	if _, err := fmt.Fscan(in, &a, &b); err != nil {
		return
	}
	out := bufio.NewWriter(os.Stdout)
	fmt.Fprintln(out, a+b)
	out.Flush()
}
