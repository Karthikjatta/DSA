class Solution {
    public String longestCommonPrefix(String[] arr) {
   for(int i=0;i<arr[0].length();i++){
        char c=arr[0].charAt(i);
        for(int j=1;j<arr.length;j++){
            if(i>=arr[j].length()||arr[j].charAt(i)!=c){
                return arr[0].substring(0,i);
            }
        }
       }
       return arr[0];
        
    }
}