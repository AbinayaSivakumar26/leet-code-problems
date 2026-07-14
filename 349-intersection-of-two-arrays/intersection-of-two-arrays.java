class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Set <Integer>set=new HashSet<>();
        for(int i=0,j=0;i<nums1.length &&j<nums2.length;){
            if(nums1[i]==nums2[j]){
                set.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else{
                i++;
            }
        }
        int arr[]=new int[set.size()];
        int x=0;
        for(int i:set){
            arr[x++]=i;
        }
        return arr;
    }
}