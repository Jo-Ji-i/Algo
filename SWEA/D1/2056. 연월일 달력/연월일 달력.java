
import java.awt.*;
import java.util.*;

public class Solution {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int check = 0;

        for(int t=0; t<T; t++){
            String str = sc.next();
            int Year = Integer.parseInt(str.substring(0, 4));
            int Month = Integer.parseInt(str.substring(4, 6));
            int Day = Integer.parseInt(str.substring(6, 8));

            if(Month==1 || Month == 3 || Month == 5 || Month == 7 || Month == 8 || Month == 10 || Month == 12){
                if(Day > 0 && Day <32) check = 1;
            }else if(Month==4 || Month == 6 || Month == 9 || Month == 11){
                if(Day > 0 && Day <31) check = 1;
            }else if(Month==2){
                if(Day > 0 && Day <29) check = 1;
            }

            if(check == 1) {
                System.out.println("#" + (t+1) + " " + String.format("%04d", Year) + "/" + String.format("%02d", Month) + "/" + String.format("%02d", Day) );
            }else System.out.println("#" + (t+1) + " -1");

            check = 0;
        }
    }
}