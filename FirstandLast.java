//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/

//This is a slow solution, it does work.  Will work on making it faster

class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        boolean isFound = false;
        int index = (int)(nums.length-1)/2;
        int start = 0;
        int end = nums.length-1;
        
        //These are the first/last index of target, -1 means target not found.
        int first = -1;
        int last = -1;
        while(!isFound && start <= end){
            System.out.println("  index: "+index);
            if(nums[index] < target){
                start = index + 1;
            } else if(nums[index] == target){
                //found target begin fanning out
                isFound = true;
            } else {
                end = index - 1;
            }
            index = (int)(start + end)/2;
        }
        System.out.println("index: "+index);
        if(isFound){
            for(int i = index; i >= 0; i--){
                if(nums[i] == target){
                    first = i;
                } else {
                    break;
                }
            }
            for(int i = index; i < nums.length; i++){
                if(nums[i] == target){
                    last = i;
                } else {
                    break;
                }
            }
        }
        
        return new int[] {first, last} ;
    }
}