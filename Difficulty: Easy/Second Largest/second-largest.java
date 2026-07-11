class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int n=arr.length+1;
        int lar1=Integer.MIN_VALUE;
        int lar2=Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]>lar1)
            {
                lar2=lar1;
                lar1=arr[i];
            }
            else if(lar2<arr[i] && arr[i]<lar1)
            {
                lar2=arr[i];
            }
        }
        if(lar2==Integer.MIN_VALUE)
         return -1;
        else
         return lar2;
    }
}