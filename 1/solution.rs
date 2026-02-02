// 思路：读入两个整数，输出其和。
// 复杂度：时间 O(1)，空间 O(1)。
use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    let mut it = input.split_whitespace();
    let a: i64 = match it.next() { Some(v) => v.parse().unwrap(), None => return };
    let b: i64 = match it.next() { Some(v) => v.parse().unwrap(), None => return };
    print!("{}", a + b);
}
