class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n=strs.length;
        Map <String,ArrayList<String>> map=new HashMap<>();
        for(String st:strs){
            char arr[]=st.toCharArray();
            Arrays.sort(arr);
            String key=new String(arr);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<String>());
            }
            map.get(key).add(st);
        }
        return new ArrayList<>(map.values());
    }
}