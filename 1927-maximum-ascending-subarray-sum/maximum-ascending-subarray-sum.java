class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum=nums[0],res=nums[0];
        for(int i=1;i<nums.length;i++)
        {
         
            if(nums[i-1]<nums[i])
            {
                sum+=nums[i];
            }
            else
            {
                sum=nums[i];
            }
            if(sum>res)
             res=sum;
        }
        return res;
    }
}