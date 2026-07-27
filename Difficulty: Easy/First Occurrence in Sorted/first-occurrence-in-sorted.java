class Solution {
    public int firstSearch(int[] arr, int k) {
        // Code Here
        Arrays.sort(arr);
        int res=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==k)
            {
                res=i;
                break;
            }
           
        }
        return res;
    }
}