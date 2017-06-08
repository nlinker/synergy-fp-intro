module Main where

import Prelude hiding (map, filter)
import Data.Char (toUpper)
import Data.List (concat, replicate)

-- Lesson1

upperCaser :: String -> String
upperCaser s = map toUpper s

concatenator :: String -> Integer -> String
concatenator s n = concat (replicate n s)

-- Lesson 2

hooray :: IO ()
hooray = putStrLn "Hooray!"

repeat :: IO a -> Integer -> IO ()
repeat act n = replicateM_ n act

replicateConcat :: (String -> String) -> Integer -> String -> String
replicateConcat f n = \s -> concat (replicate n (f s))

-- Lesson 3

map :: (a -> b) -> [a] -> [b]
map _ [] = []
map f (x:xs) = f x : map f xs

doubleAll :: [Integer] -> [Integer]
doubleAll xs = map (* 2) xs
-- eta reduction:
-- doubleAll = map (* 2)

-- Lesson 4

filter :: (a -> Bool) -> [a] -> [a]
filter _ [] = []
filter f (x:xs) = if f x then x : filter f xs

getShortMessages :: [String] -> [String]
getShortMessages xs = filter (length xs <= 20) xs
-- eta reduction:
-- getShortMessages = filter (length xs <= 20)
