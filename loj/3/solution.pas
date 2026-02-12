program Main;

uses SysUtils;

function ParseIntFromLine(const s: AnsiString): LongInt;
var
  i: LongInt;
  v: LongInt;
begin
  v := 0;
  for i := 1 to Length(s) do
  begin
    if (s[i] >= '0') and (s[i] <= '9') then
      v := v * 10 + Ord(s[i]) - Ord('0');
  end;
  ParseIntFromLine := v;
end;

var
  fin, fout: Text;
  t, i: LongInt;
  line: AnsiString;
begin
  Assign(fin, 'copycat.in');
  Reset(fin);
  Assign(fout, 'copycat.out');
  Rewrite(fout);

  if EOF(fin) then
  begin
    Close(fin);
    Close(fout);
    Halt(0);
  end;

  ReadLn(fin, line);
  t := ParseIntFromLine(line);

  for i := 1 to t do
  begin
    if EOF(fin) then Break;
    ReadLn(fin, line);
    Write(fout, line);
    if i < t then
      WriteLn(fout);
  end;

  Close(fin);
  Close(fout);
end.
