class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int right=n+m-1;
        int mLast=m-1;
        int nLast=n-1;
        while(nLast>=0){
            if(mLast>=0 && nums1[mLast]>nums2[nLast]){
                nums1[right]=nums1[mLast];
                mLast--;
                right--;
            }else{
                nums1[right]=nums2[nLast];
                nLast--;
                right--;
            }
        }
        
    }
}