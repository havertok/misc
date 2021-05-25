class Solution {
    public int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int prev = 0;
        int num = 0;
        for(int i = chars.length-1; i >= 0; i--){
            int val = getVal(chars[i]);
            if(prev > val){
                num -= val;
            } else {
                num += val;
            }
            prev = val;
        }
        
        
        return num;
    }
    
    public int getVal(char c){
        if(c == 'I') return 1;
        else if(c == 'V') return 5;
        else if(c == 'X') return 10;
        else if(c == 'L') return 50;
        else if(c == 'C') return 100;
        else if(c == 'D') return 500;
        else if(c == 'M') return 1000;
        return 0;
    }
}