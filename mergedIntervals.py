class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        if(len(intervals) == 1):
            return intervals
        #lambda is used for .sort() in complex objects, sort by starting int in interval
		#sort first so each overlapping interval is in line with eachother
        intervals.sort(key=lambda x: x[0]) 
        result = []
        # VERY similar to what I tried at first, I forget python has some nice features (like no and [-1])
        # can't mess up indexes if I don't use them!
        for interval in intervals:
            if not result or result[-1][1] < interval[0]:
                result.append(interval)
            else:
                #there was something in result AND it overlapped, max returns largest end num
                result[-1][1] = max(result[-1][1], interval[1]) 
                
        return result
        
    