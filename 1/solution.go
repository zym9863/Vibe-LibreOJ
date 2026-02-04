// 思路：读取两个整数 a、b，输出 a+b。
// 复杂度：时间 O(1)，空间 O(1)。
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
	fmt.Print(a + b)
}
