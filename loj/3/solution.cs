using System;
using System.IO;
using System.Linq;

class Program
{
    static void Main()
    {
        if (!File.Exists("copycat.in"))
        {
            File.WriteAllText("copycat.out", string.Empty);
            return;
        }

        var tokens = File.ReadAllText("copycat.in")
            .Split((char[])null, StringSplitOptions.RemoveEmptyEntries);

        if (tokens.Length == 0)
        {
            File.WriteAllText("copycat.out", string.Empty);
            return;
        }

        int t = int.TryParse(tokens[0], out var n) ? n : 0;
        var vals = tokens.Skip(1).Take(t);
        File.WriteAllText("copycat.out", string.Join("\n", vals));
    }
}

