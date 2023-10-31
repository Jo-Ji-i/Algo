class Solution {
    public String solution(String my_string, String alp) {
        StringBuilder sb = new StringBuilder();
        for(String s: my_string.split("")){
            if(s.equals(alp)) sb.append(alp.toUpperCase());
            else sb.append(s);
        }
        return sb.toString();
    }
}