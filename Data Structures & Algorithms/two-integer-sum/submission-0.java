class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        
        Map<Integer,Integer>mp = new HashMap<>();

        for(int i=0;i<n;i++){
            int find = target-nums[i];
            if(mp.containsKey(find)){
                
                ans[0]=mp.get(find);
                ans[1]=i;
                return ans;
            }
            mp.put(nums[i],i);
        }
        return new int[]{};
    }
}
