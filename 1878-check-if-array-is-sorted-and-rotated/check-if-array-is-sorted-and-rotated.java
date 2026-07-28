class Solution {
    public boolean check(int[] nums) {
       int n=nums.length;
       int count=1;
       if(n==1)
          return true;
       for(int i=1;i<n*2;i++)
       {
        if(nums[(i-1)%n]<=nums[i%n])
        {
            count+=1;
        }
        else
        {
            count=1;
        }
        if(count==n)
          return true;
       }
       return false;
    }
}