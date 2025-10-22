class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuilder sb = new StringBuilder();
        char[] my = my_string.toCharArray();
        for(int i: index_list){
            sb.append(my[i]);
        }
        return sb.toString();
    }
}