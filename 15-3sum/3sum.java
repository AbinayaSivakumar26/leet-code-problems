class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        List <List <Integer>> li=new ArrayList<>();
        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int s=0;
            int l=i+1;
            int r=nums.length-1;
            while(r>l)
            {
                
                s=nums[i]+nums[l]+nums[r];
                if(s==0){
                    List <Integer> ll=new ArrayList<>();
                    ll.add(nums[i]);
                    ll.add(nums[l]);
                    ll.add(nums[r]);
                    li.add(ll);
                    l++;
                    r--;
                    while(r!=i && nums[r]==nums[r+1]){
                        r--;
                    }
                    while(l!=n-1 && nums[l]==nums[l-1]){
                        l++;
                    }
                }
                else if(s<0){
                    l++;
                }
                else{
                    r--;
                }
            }

        }
        return li;
        
    }
}