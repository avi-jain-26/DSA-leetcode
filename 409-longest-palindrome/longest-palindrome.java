class Solution {
    public int longestPalindrome(String s) 
    {
        int freq[]=new int[128];

        for(char ch:s.toCharArray())
        {
            freq[ch]++;
        }

        int even=0;
        boolean odd=false;
        for(int i:freq)
        {
            even+=(i/2)*2;

            if(i%2==1)
            {
                odd=true;
            }
        }

        if(odd)
        {
            even+=1;
        }

        return even;

        
        
    }
}