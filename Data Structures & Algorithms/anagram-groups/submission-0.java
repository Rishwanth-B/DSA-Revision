class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mpp=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] c=strs[i].toCharArray();
              Arrays.sort(c);
            String s=new String(c);
            if(!mpp.containsKey(s)){
                mpp.put(s,new ArrayList<>());
            }
            mpp.get(s).add(strs[i]);
        }
        return new ArrayList<>(mpp.values());
    }
}
