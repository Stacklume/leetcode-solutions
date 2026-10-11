class Solution {
    public int maxProduct(int[] nums) {
        int min_prod=nums[0];
        int max_prod=nums[0];
        int result=nums[0];
        for(int i=1;i<nums.length;i++){
            int num=nums[i];
            if(num<0){
                int temp=min_prod;
                min_prod=max_prod;
                max_prod=temp;
            }
            min_prod=Math.min(num,min_prod*num);
            max_prod=Math.max(num,max_prod*num);
            result=Math.max(result,max_prod);
        }
        return result;
    }
}
