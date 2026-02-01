{ 思路：直接读入 a 和 b，输出 a+b。
  复杂度：O(1) }
program Main;

var
  a, b: Int64;

begin
  if not EOF(input) then
  begin
    Read(a, b);
    Writeln(a + b);
  end;
end.
