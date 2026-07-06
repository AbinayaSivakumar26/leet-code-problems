class Solution {
    public int singleNumber(int[] arr) {
        int  n=arr.length;
        Set <Integer> set=new HashSet<>();
        if(arr.length==1){return arr[0];}
        for(int i:arr){
            if(!set.add(i)){
                set.remove(i);
            }
        }
        
        if(!set.isEmpty()){
            int i=set.iterator().next();
            return i;
        }
        return 1;
        
    }
}