class Solution {
    public int trap(int[] arr) {
        int l=0;
        int r=arr.length-1;
        int wat=0;
        int lm=0;
        int rm=0;
        while(l<r){
            if(arr[l]<arr[r]){
                if(arr[l]>=lm){
                    lm=arr[l];
                }
                else{
                    wat+=(lm-arr[l]);
                }
                l++;
            }
            else{
                if(arr[r]>=rm){
                    rm=arr[r];
                }
                else{
                    wat+=(rm-arr[r]);
                }
                r--;
            }
        }
        return wat;
    }
}