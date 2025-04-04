class Solution {
    public boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == goal.charAt(0)) {

                StringBuilder sb = new StringBuilder(s);
            
                for (int j = 0; j < i; j++) {
                    sb.append(s.charAt(j));
                }

                sb.delete(0, i);

                if (sb.toString().equals(goal)) {
                    return true;
                }
            }
        }

        return false;
    }
}
