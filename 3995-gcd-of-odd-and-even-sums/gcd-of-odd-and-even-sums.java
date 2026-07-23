class Solution {
    public int gcdOfOddEvenSums(int n) {
        int ans=0;
        int Es=0;
        int Os=0;
        int min=0;
       for(int i=1;i<=n*2;i++)
       {
        if(i%2==0)
        {
            
            Es+=i;
        }
        else{
            Os+=i;
        }
        
       } 
       if(Es<Os)
        {
            min =Es;
        }
        else{
            min=Os;
        }
       for(int i=1;i<=min;i++)
       {
        if(Es%i==0 && Os%i==0)
        {
           ans=i;
        }

       }
       return ans;
    }
}