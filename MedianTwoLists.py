class Solution:
    
    def findMedian(self, nums: List[int]) -> float:
        temp = 0.0
        index = int(len(nums) / 2)
        if(len(nums) % 2 == 0 ):
            temp = nums[index-1] + nums[index]
            temp = temp / 2
        else:
            temp = nums[index]
        return temp
    
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        if not nums1:
            return self.findMedian(nums2)
        if not nums2:
            return self.findMedian(nums1)
        
        nums1.extend(nums2) #kind of cheating, I (sh/c)ould merge or sort them myself
        nums1.sort()
        
        temp = self.findMedian(nums1)
        return temp
        
        
