#This kinda sucks to be honest, slow and with big memory requirements
#it does work though
import re

class Solution:
    def calculate(self, s: str) -> int:
        stack = []
        i = 0
        
        def stackOp(c, t):
            if(c.isnumeric()):
                stack.append(int(c))
                return 0
            elif(c == '+'):
                stack.append(int(t))
            elif(c == '-'):
                stack.append(-int(t))
            elif(c == '*'):
                stack.append(stack.pop() * int(t))
            elif(c == '/'):
                stack.append(int(stack.pop() / int(t)))
            else:
                return 0
            return 1
            
        temp = s.strip()
        temp = temp.replace(" ", "")
        comp = re.split('(\d+)',temp)
        comp = list(filter(None, comp))
        if(len(comp) <= 1):
            stack.append(int(comp[0]))
            return sum(stack)
        
        while(i < len(comp)):
            i = i + stackOp(comp[i], comp[i+1])
            i = i+1
            
        return sum(stack)
        
        
