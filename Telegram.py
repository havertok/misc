#From https://wiki.c2.com/?TelegramProblem
#Take first num of words to print out, then the input text
import re

#should match 1+ reps of either upper/lower
words_pattern = '[a-zA-Z]+'

w = int(input("Type in a number of words to print out: "))
text = input("Type in some words/text, make sure to use spaces... ")
outStream = ""

print(w, "\n")
print(text)

wordList = re.findall(words_pattern, text)

for index in range(w):
    outStream += (wordList[index] + " ")

print(outStream);
