import Data.List (intercalate)

main :: IO ()
main = do
  content <- readFile "copycat.in"
  let ws = words content
      t = case ws of
        (x:_) -> read x :: Int
        _ -> 0
      vals = take t (drop 1 ws)
  writeFile "copycat.out" (intercalate "\n" vals)

