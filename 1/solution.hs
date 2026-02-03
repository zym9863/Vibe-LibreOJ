-- 思路：读入两个整数 a、b，输出 a + b。
-- 复杂度：时间 O(1)，空间 O(1)。
import Data.List (unwords)

main :: IO ()
main = do
    contents <- getContents
    let ws = words contents
    if length ws < 2
      then return ()
      else do
        let a = read (ws !! 0) :: Integer
        let b = read (ws !! 1) :: Integer
        putStrLn (show (a + b))
