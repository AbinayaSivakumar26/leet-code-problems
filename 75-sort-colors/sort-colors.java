class Solution {
    public void sortColors(int[] arr) {
        int l=0;
        int m=0;
        int h=arr.length-1;
        while(m<=h){
        if(arr[m]==0){
            int temp=arr[m];
            arr[m]=arr[l];
            arr[l]=temp;
            m++;
            l++;
        }
        else if(arr[m]==1){
            m++;
            continue;
            
        }
        else{
            int temp=arr[m];
            arr[m]=arr[h];
            arr[h]=temp;
            h--;
        }
        }
    }
}