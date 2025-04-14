class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int[] ans = new int[nums1.length+nums2.length];
        int k =0;
        
        for(int i=0; i<nums1.length; i++){
            ans[k] = nums1[i];
            k++;
        }
        for(int i =0; i<nums2.length; i++){
            ans[k] = nums2[i];
            k++;
        }
         Arrays.sort(ans);

        //  int sum =0;
        // for(int i=0; i<ans.length; i++){
        //     sum += ans[i];
        // }
        
        // return (double) (sum/ans.length);
        
        if(ans.length%2==1){
           return (double) ans[ans.length/2];
        }
        else{
            int middle = ans[ans.length/2];
            int middle2 = ans[(ans.length/2)-1];
            return (double) (middle+middle2)/2;
        }


    }
}