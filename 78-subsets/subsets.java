class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lst = new ArrayList<>();
        List<Integer> lst2 = new ArrayList<>();

        generate(lst,lst2,0,nums);
        return lst;
    }

    public void generate(List<List<Integer>> lst,List<Integer> lst2, int index, int[] nums ){
        
        if(index==nums.length){
           lst.add(new ArrayList<>(lst2));
           return;
        }

        lst2.add(nums[index]);
        generate(lst,lst2,index+1,nums);

        lst2.remove(lst2.size()-1);
        generate(lst,lst2,index+1,nums);
    }
}