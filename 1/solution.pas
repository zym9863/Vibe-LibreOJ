{ 思路：直接读取两个整数并输出其和。
  复杂度：时间 O(1)，空间 O(1)。 }
program Main;
var
  a, b: int64;
begin
  if not EOF(input) then
  begin
    read(a, b);
    write(a + b);
  end;
end.
