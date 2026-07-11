class Solution {
    static void rotateArr(int arr[], int d) {
        // code here
        int n=arr.length;
        d=d%n;
        int[] temp=new int[n];
         for (int i = 0; i < n - d; i++)
            temp[i] = arr[d + i];

        // Copy the first d elements to the back of temp
        for (int i = 0; i < d; i++)
            temp[n - d + i] = arr[i];

        // Copying the elements of temp in arr
        // to get the final rotated array
        for (int i = 0; i < n; i++)
            arr[i] = temp[i];
        
    }
}