-- 思路：读取两个整数 a、b，输出 a+b。
-- 复杂度：时间 O(1)，空间 O(1)。
import Data.List

main :: IO ()
main = do
  input <- getContents
  let ws = words input
  if length ws < 2 then return () else do
    let a = read (ws !! 0) :: Integer
    let b = read (ws !! 1) :: Integer
    print (a + b)
