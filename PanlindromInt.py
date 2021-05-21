class Solution:
    def isPalindrome(self, x: int) -> bool:
        if(x < 0):
            return False
        if(x == 0):
            return True
        
        print("x: " + str(x))
        high = int(math.log10(x))
        low = 0
        while(low <= high):
#             print("pow high: " + str(10**high))
#             print("pow low: " + str(10**low % 10))
#             print("x h mod: " + str(x // 10**high % 10))
#             print("x l mod: " + str(x // 10**low % 10))
            
            if(x // 10**high % 10 != x // 10**low % 10):
                return False
            high = high -1
            low = low +1
        return True