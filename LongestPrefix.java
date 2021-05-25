class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return  "";
        if(strs.length == 1) return  strs[0];
        
        String initMatch = strs[0];
        StringBuilder sb = new StringBuilder(initMatch);
        if(initMatch.length() == 0) return "";
        int sbL = sb.length();
        
        for(int k = 1; k < strs.length; k++){
            for(int i = 0; i < sbL; i++){
                sbL = sb.length();
                int stL = strs[k].length();
                if(stL == 0) return "";
                if(stL-1 < i) {
                    sb = sb.delete(i, sbL);
                    break;
                }
                if(initMatch.charAt(i) != strs[k].charAt(i)){
                    sb = sb.delete(i, sbL);
                    break;
                }
            }

        }
       
        return sb.toString();
    }
}