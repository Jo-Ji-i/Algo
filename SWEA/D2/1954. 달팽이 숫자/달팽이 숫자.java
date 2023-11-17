
import java.util.*;

public class Solution {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int t=1; t<=T; t++){
            int N = sc.nextInt();
            int[][] arr = new int[N][N];
            int num = 1;

            int x = 0;
            int y = 0;

            while(true){
                // right
                while(true){
                    arr[x][y] = num++;
                    if(y+1 == N || arr[x][y+1] != 0) break;
                    y += 1;
                }
                if(x+1 == N || arr[x+1][y] != 0) break;
                x += 1;

                // bottom
                while(true){
                    arr[x][y] = num++;
                    if(x+1 == N || arr[x+1][y] != 0) break;
                    x+=1;
                }
                if(y-1 == N || arr[x][y-1] != 0) break;
                y -= 1;

                // left
                while (true){
                    arr[x][y] = num++;
                    if(y-1 == -1 || arr[x][y-1] != 0) break;
                    y -= 1;
                }
                if(x-1 == 0 || arr[x-1][y] != 0) break;
                x -= 1;

                // up
                while(true){
                    arr[x][y] = num++;
                    if(x-1 == -1 || arr[x-1][y] != 0) break;
                    x -= 1;
                }
                if(y+1 == N || arr[x][y+1] != 0) break;
                y += 1;
            }

            System.out.println("#" + t);
            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}