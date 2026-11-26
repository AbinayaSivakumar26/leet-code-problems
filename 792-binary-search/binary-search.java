class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int l=0;
        int r=n-1;
        int m=-1;
        while(l<=r){
            m=l+(r-l)/2;
            System.out.print(nums[m]);
            if(nums[m]==target){
                return m;
            }
            else if(nums[m]<target){
                l=m+1;
            }
            else{
                r=m-1;
            }
        }
        return -1;
    }
}