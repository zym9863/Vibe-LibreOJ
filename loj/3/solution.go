package main

import (
	"bufio"
	"io"
	"os"
	"strings"
)

func main() {
	input, err := os.Open("copycat.in")
	if err != nil {
		_ = os.WriteFile("copycat.out", []byte{}, 0644)
		return
	}
	defer input.Close()

	data, _ := io.ReadAll(bufio.NewReader(input))
	tokens := strings.Fields(string(data))
	if len(tokens) == 0 {
		_ = os.WriteFile("copycat.out", []byte{}, 0644)
		return
	}

	t := 0
	for _, ch := range tokens[0] {
		if ch < '0' || ch > '9' {
			break
		}
		t = t*10 + int(ch-'0')
	}

	output, err := os.Create("copycat.out")
	if err != nil {
		return
	}
	defer output.Close()

	w := bufio.NewWriter(output)
	defer w.Flush()

	idx := 1
	for i := 0; i < t && idx < len(tokens); i++ {
		_, _ = w.WriteString(tokens[idx])
		if i+1 < t {
			_ = w.WriteByte('\n')
		}
		idx++
	}
}

