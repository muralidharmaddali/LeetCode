class Solution {
    public int thirdMax(int[] nums) {
       TreeSet<Integer> ts = new TreeSet<>();

       for(int i:nums)
       {
        ts.add(i);

        if(ts.size()>3) ts.remove(ts.first());
       }

       if(ts.size()==3) return ts.first();
       return ts.last();

        
    }
}