class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] temp=arr.clone();
        int rank=1;
        Arrays.sort(temp);
     for(int i=0;i<temp.length;i++)
     {
        if(!map.containsKey(temp[i]))
        {
            map.put(temp[i],rank);
            rank++;
        }
     }   
     for(int i=0;i<arr.length;i++)
     {
        temp[i]=map.get(arr[i]);
     }
     return temp;
    }
}