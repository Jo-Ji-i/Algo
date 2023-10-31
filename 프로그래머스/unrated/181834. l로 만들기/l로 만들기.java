class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        for(char c: myString.toCharArray()){
            sb.append((byte)c < 108 ? "l" : c); 
        }
        return sb.toString();
    }
}