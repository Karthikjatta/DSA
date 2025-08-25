class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr=s.split(" ");
        if(pattern.length()!=arr.length) return false;
        HashMap<Character,String> mp=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char c=pattern.charAt(i);
            if(mp.containsKey(c)){
                String a=mp.get(c);
                if(!arr[i].equals(a)) return false;
            }
            else{
                if(mp.containsValue(arr[i])) return false;
                mp.put(c,arr[i]);
            }
        }
        return true;
    }
}