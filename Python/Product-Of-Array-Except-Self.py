class Solution:
    def productExceptSelf(self, nums: list[int]) -> list[int]:
        prod=[]
        p=1
        q=1
        for i in range(len(nums)):
            prod.append(p)
            p*=nums[i]
        for i in range(len(nums)-1,-1,-1):
            prod[i]*=q
            q*=nums[i]
        return prod
