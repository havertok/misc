import sys

#this is super slow for some reason.  The int to str reverse str was faster
#but not really in the spirit of the exercise
#  https://leetcode.com/problems/reverse-integer/

class Solution:
    def reverse(self, x: int) -> int:
        temp = x
        output = 0
        max_int = 2**31
        min_int = -2**31
        while(temp != 0):
            if(temp < 0):
                pop = temp % -10
            else:
                pop = temp % 10
            temp = (int)(temp / 10)
            if((output == max_int and pop > 7) or (output == min_int and pop < -8)):
                return 0
            if(output > max_int/10 or output < min_int/10):
                return 0
            output = output * 10 + pop
        return output
