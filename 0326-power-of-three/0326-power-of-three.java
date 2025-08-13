class Solution {
    public boolean isPowerOfThree(int n) {
        for(int i=0;i<1000;i++)
        {
            double x = Math.pow(3,i);
            if(x==n) return true;
        }
        return false;
    }
}