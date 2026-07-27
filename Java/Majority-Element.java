class Solution {
    public int majorityElement(int[] nums) {
        int c=0;
        int times=0;
        for(int num:nums){
            if(times==0){
                c=num;
            }
            if(num==c){
                times++;
            }
            else{
                times--;
            }
        }
        return c;
        }
        }
