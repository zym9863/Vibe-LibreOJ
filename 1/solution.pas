{ 思路：读取两个整数 a、b，输出 a+b。
  复杂度：时间 O(1)，空间 O(1)。 }
program Main;

var
  a, b: Int64;

begin
  if not eof(input) then
  begin
    read(a, b);
    write(a + b);
  end;
end.
