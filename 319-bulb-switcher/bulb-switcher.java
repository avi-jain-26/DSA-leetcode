class Solution {
    public int bulbSwitch(int x) {

        double n = x;
        double y = 1;
        double epsilon = 0.000001;

        while (Math.abs(n - y) > epsilon) {
            n = (n + y) / 2; 
            y = x/n; 
        }

        return (int)n;
    }
}