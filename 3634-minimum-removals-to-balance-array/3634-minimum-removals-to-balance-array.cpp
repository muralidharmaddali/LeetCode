class Solution {
public:
    int minRemoval(vector<int>& nums, int p) {
        sort(nums.begin(),nums.end());
        int k = nums.size();
        int j = 0;
        int maxi = 0;

        for(int i=0;i<k;i++)
        {
            while((long long)nums[i] > (long long)nums[j] * p)
            {
                j++;
            }
            maxi = max(maxi,i - j + 1);
        }

        return k - maxi;
    }
};