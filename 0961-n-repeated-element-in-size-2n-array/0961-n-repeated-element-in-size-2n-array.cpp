class Solution {
public:
    int repeatedNTimes(vector<int>& nums) {
        unordered_map<int,int> ump;
       for(int i=0;i<nums.size();i++)
       {
         ump[nums[i]]++;
       }
        int count=0;
        for(auto it:ump)
        {
            if(it.second>1)
            {
                count=it.first;
            }
        }
        return count;
    }
};