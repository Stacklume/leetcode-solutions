class Solution {
    public int maxSubArray(int[] nums) {
        int summ=nums[0];
        int max_sum=nums[0];
        for(int i=1;i<nums.length;i++){
            summ=Math.max(nums[i],summ+nums[i]);
            max_sum=Math.max(summ,max_sum);
        }
        return max_sum;
    }
}
