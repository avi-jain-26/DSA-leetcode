class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int i= 0; i<nums1.length; i++){
            set.add(nums1[i]);
        }

        HashSet<Integer> set2 = new HashSet<>();
        for(int i=0; i<nums2.length; i++){
            if(set.contains(nums2[i])){
                set2.add(nums2[i]);
            }
        }

        int[] result = new int[set2.size()];
        int i=0;
        for(int value : set2){
             result[i] = value;
             i++;
        }

        return result;
    }
}