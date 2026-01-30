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
