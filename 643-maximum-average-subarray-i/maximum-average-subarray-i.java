class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg;
        int sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=nums[i];
        }
        int maxsum=sum;
        int l=1;
        int r=k+1;
        while(r<=nums.length)
        {
            sum=0;
            for(int i=l;i<r;i++)
            {
                sum+=nums[i];
            }
            
            if(sum>maxsum)
            {
                maxsum=sum;
            }
            l++;
            r++;
        }
        avg=(double) maxsum/k;
        return avg;
    }
}