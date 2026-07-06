class Solution {
    public void moveZeroes(int[] nums) {
    int i=0;
    int j=0;
    for(;i<nums.length && j<nums.length-1;){
        if(nums[j]!=0){
            j++;
            i++;
        }
        else{
            if(nums[i]!=0){
                nums[j]=nums[i];
                nums[i]=0;
                j++;
            }
            else{
                i++;
            }
        }
    }

    }
}