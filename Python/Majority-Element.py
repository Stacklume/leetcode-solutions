class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        candidate=0
        times=0
        for i in nums:
            if(times==0):
                candidate=i
            if(i==candidate):
                times+=1
            else:
                times-=1
        return candidate
