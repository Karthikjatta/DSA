class Solution {
    public boolean isTyped(String s,HashSet<Character> set){
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))) return false;
        }
        return true;
    }
    public int canBeTypedWords(String text, String brokenLetters) {
        String arr[]=text.split(" ");
        HashSet<Character> s=new HashSet<>();
        for(int i=0;i<brokenLetters.length();i++){
            s.add(brokenLetters.charAt(i));
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            String st=arr[i];
            if(isTyped(st,s)) count++;
            else continue;
        }
        return count;
    }
}