{ 思路：读入两个整数 a、b，输出 a + b。
  复杂度：时间 O(1)，空间 O(1)。 }
program Main;

var
  a, b: Int64;

begin
  if not EOF then
  begin
    read(a, b);
    writeln(a + b);
  end;
end.
