-- 思路：读入两个整数，输出其和。
-- 复杂度：时间 O(1)，空间 O(1)。
main :: IO ()
main = do
  input <- getContents
  let nums = map read (words input) :: [Integer]
  if length nums >= 2
    then print (nums !! 0 + nums !! 1)
    else return ()
