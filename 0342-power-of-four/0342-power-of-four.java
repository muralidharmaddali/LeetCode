class Solution {
    public boolean isPowerOfFour(int n) {
        for(int i=0;i<1000;i++)
        {
            double m = Math.pow(4,i);
            if(m==n) return true;
        }
        return false;
    }
}