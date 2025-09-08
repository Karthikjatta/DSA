class Solution {
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        int i=0;
        int j=arr.length-1;
        Set<Character> vow=new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        while(i<j){
            while(i<arr.length&&!(vow.contains(arr[i]))) i++;
            while(j>=0&&!(vow.contains(arr[j]))) j--;
            if(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
            }
        }
        return new String(arr); 
    }
}