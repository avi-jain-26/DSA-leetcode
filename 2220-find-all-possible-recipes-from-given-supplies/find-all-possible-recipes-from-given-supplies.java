class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        ArrayList<String> ans = new ArrayList<>();

        HashSet<String> set = new HashSet<>();
        for(String i : supplies){
            set.add(i);
        }

        boolean updated = true;

        while(updated){
            updated =  false;
            for(int i=0; i<ingredients.size(); i++){
                if(set.contains(recipes[i])){
                      continue;
                }

                List<String> curr = ingredients.get(i);
                 boolean present = true;
                for(int j=0; j<curr.size(); j++){
                    if(!set.contains(curr.get(j))){
                        present = false;
                        break;
                    }
                }

                if(present){
                    set.add(recipes[i]);
                    ans.add(recipes[i]);
                    updated = true;
                }
            }
        }

        return ans;
    }
}