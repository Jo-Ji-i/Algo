class Solution {
    public int solution(String binomial) {
        String[] str = binomial.split(" ");
        int result = 0;
        switch(str[1]){
            case "+": result = Integer.parseInt(str[0]) + Integer.parseInt(str[2]);
                break;
            case "-": result = Integer.parseInt(str[0]) - Integer.parseInt(str[2]);
                break;
            case "*": result = Integer.parseInt(str[0]) * Integer.parseInt(str[2]);
                break;
        }
        return result;
    }
}