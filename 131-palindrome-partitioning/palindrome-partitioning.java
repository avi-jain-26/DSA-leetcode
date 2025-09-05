class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> part = new ArrayList<>();

        dfs(0, s, res, part);
        return res;
    }

    private void dfs(int index, String s, List<List<String>> res, List<String> part) {
        if (index >= s.length()) {
            res.add(new ArrayList<>(part)); 
            return;
        }

        for (int j = index; j < s.length(); j++) {
            if (isPali(s, index, j)) {
                part.add(s.substring(index, j + 1));
                dfs(j + 1, s, res, part);         
                part.remove(part.size() - 1);        
            }
        }
    }

    private boolean isPali(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}