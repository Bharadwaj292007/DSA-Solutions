class Solution {
    public String reverseWords(String s) {
        // Code here
       String words[]=s.split("\\.+");
       StringBuilder ans=new StringBuilder();
       boolean first=true;
       for(int i=words.length-1;i>=0;i--)
       {
       if(!words[i].isEmpty())
       {
           if(!first)
             ans.append(".");
           ans.append(words[i]);
           first =false;
       }
       }
       return ans.toString();
    }
}
