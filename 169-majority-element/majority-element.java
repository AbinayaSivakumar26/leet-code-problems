class Solution {
    public int majorityElement(int[] nums) {
        int can=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(c==0){
                can=nums[i];
            }
            if(can==nums[i]){
                c++;
            }
            else{
                c--;
            }
        }
        return can;
    }
}