class Solution {
    public int solution(String myString, String pat) {
        String dif = "";
        for(char s : myString.toCharArray()){
            dif += (s == 'A' ? "B" : "A");
        }
        return dif.contains(pat)? 1: 0;
    }
}