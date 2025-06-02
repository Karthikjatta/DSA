class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List> mp=new HashMap<>();
        int[] arr=new int[26];
        for(String str:strs){
            Arrays.fill(arr,0);
            for(char c:str.toCharArray()){
                arr[c-'a']++;
            }
            StringBuilder sb=new StringBuilder();
            for(int i:arr){
                sb.append("#");
                sb.append(i);
            }
            String key=sb.toString();
            if(!mp.containsKey(key)){
                mp.put(key,new ArrayList());
            }
                mp.get(key).add(str);
        }
        return new ArrayList(mp.values());
    }
}