{ 思路：直接读入两个整数并输出它们的和。 }
{ 复杂度：时间 O(1)，空间 O(1)。 }
program Main;

var
  a, b: Int64;
begin
  if not EOF(Input) then
  begin
    Read(a, b);
    Write(a + b);
  end;
end.
