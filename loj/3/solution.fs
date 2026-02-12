open System
open System.IO

[<EntryPoint>]
let main _ =
    let outputPath = "copycat.out"
    if not (File.Exists("copycat.in")) then
        File.WriteAllText(outputPath, "")
    else
        let tokens =
            File.ReadAllText("copycat.in").Split(
                [| ' '; '\n'; '\r'; '\t' |],
                StringSplitOptions.RemoveEmptyEntries
            )

        if tokens.Length = 0 then
            File.WriteAllText(outputPath, "")
        else
            let t =
                match Int32.TryParse(tokens.[0]) with
                | true, v -> v
                | _ -> 0
            let vals = tokens |> Array.skip 1 |> Array.truncate t
            File.WriteAllText(outputPath, String.Join("\n", vals))
    0

