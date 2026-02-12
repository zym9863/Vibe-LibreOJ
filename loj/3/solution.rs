use std::fs;
use std::io::Write;

fn main() {
    let input = fs::read_to_string("copycat.in").unwrap_or_default();
    let mut it = input.split_whitespace();
    let t: usize = it.next().and_then(|s| s.parse().ok()).unwrap_or(0);

    let mut out = String::new();
    for i in 0..t {
        if let Some(a) = it.next() {
            out.push_str(a);
            if i + 1 < t {
                out.push('\n');
            }
        } else {
            break;
        }
    }

    let mut file = fs::File::create("copycat.out").expect("failed to create output file");
    file.write_all(out.as_bytes())
        .expect("failed to write output");
}

