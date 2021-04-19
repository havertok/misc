//https://leetcode.com/problems/find-the-duplicate-number/solution/
//Possible solution I haven't tested it yet
//Should sort list first, if there is a match then it would return right away (if we are allowed to, sort takes time)
//could also use set and check against that, one run through but need memory
public class Solution {
    public int FindDuplicate(int[] nums) {
        int checker;
        int rolling = 0; //will be set to 1 anyway
        bool found = false;
        
        while(!found){
            checker = nums[rolling]; //is 0 on first run, 1 on second etc
            rolling++;
            for(int i = rolling; i < nums.length; i++){
                if(checker == nums[i]){
                    found = true;
                    return checker;
                }
            }
        }
        return -1; //somehow we found no duplicate num
    }
}