class Solution {
    public boolean helper(String s,char x){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==x) return true;
        }
        return false;
    }
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans=new ArrayList<>();
       for(int i=0;i<words.length;i++){
        if(helper(words[i],x)) ans.add(i);
       }
       return ans;
    }
}