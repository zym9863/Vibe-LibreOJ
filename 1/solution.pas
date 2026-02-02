{ 思路：读入两个整数，输出其和。
  复杂度：时间 O(1)，空间 O(1)。 }
program Main;
var
  a, b: Int64;
begin
  if not eof(input) then
  begin
    readln(a, b);
    writeln(a + b);
  end;
end.
