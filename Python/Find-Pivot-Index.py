class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        total_sum=0
        for i in nums:
            total_sum+=i
        left=0
        for i in range(len(nums)):
            right=total_sum-left-nums[i]
            if(left==right):
                return i
            left+=nums[i]
        return -1
