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
