class Solution {
    public String[] solution(String[] names) {
        int len = names.length%5==0? 0:1;
        String[] name = new String[names.length/5 + len];
        for(int i=0; i<names.length; i+=5){
            name[i/5] = names[i];
        }
        return name;
    }
}