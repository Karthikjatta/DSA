class Solution {
    public int longestPalindrome(String[] words) {
       HashMap<String,Integer> mp=new HashMap<>();
       int maxlen=0;
        for(int i=0;i<words.length;i++){
            String rev=new StringBuilder(words[i]).reverse().toString();
            if(mp.containsKey(rev)&& mp.get(rev)>0){
                maxlen+=4;
                mp.put(rev,mp.get(rev)-1);
            }
            else{
            mp.put(words[i],mp.getOrDefault(words[i],0)+1);
            }
        }
        for(String key:mp.keySet()){
            if(key.charAt(0)==key.charAt(1) && mp.get(key)>0){
                maxlen+=2;
                break;
            }
        }
        return maxlen;
    }
}