class Solution {
    public boolean isAnagram(String s, String t) {
        char[] one=s.toCharArray();
        char[] two=t.toCharArray();
        Arrays.sort(one);
        Arrays.sort(two);
        return Arrays.equals(one,two);

    }
}