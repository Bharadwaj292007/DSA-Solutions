class Solution {
    public int search(int[] nums, int target) {
        int left=0;
        int n=nums.length-1;
        int right=n;
        boolean flag=false;
        int index=0;
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(nums[mid]==target)
            {
                index=mid;
                flag=true;
                break;
            }
            else if(nums[mid]<target)
            {
                left=mid+1;
            }
            else
            {
               right=mid-1;
            }
        }
        if(flag){
        return index;
        }
        else
        {
            return -1;
        }
    }
}