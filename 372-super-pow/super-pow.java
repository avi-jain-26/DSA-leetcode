import java.math.BigInteger;

class Solution {
    public int superPow(int a, int[] b) {
        // Convert b array to a BigInteger exponent
        StringBuilder str = new StringBuilder();
        for (int digit : b) {
            str.append(digit);
        }
        
        BigInteger exponent = new BigInteger(str.toString()); // Convert to BigInteger
        BigInteger base = BigInteger.valueOf(a);
        BigInteger mod = BigInteger.valueOf(1337);
        
        // Compute a^b % 1337 using BigInteger
        BigInteger result = base.modPow(exponent, mod);
        
        return result.intValue();
    }
}
