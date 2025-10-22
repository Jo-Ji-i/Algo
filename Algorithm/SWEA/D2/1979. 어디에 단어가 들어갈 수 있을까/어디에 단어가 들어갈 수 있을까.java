
import java.util.*;

public class Solution {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int t=1; t<=T; t++){
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[][] puzzle = new int[N][N];
            int answer = 0;

            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    puzzle[i][j] = sc.nextInt();
                }
            }

            int cnt_c = 0;
            int cnt_r = 0;

            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    if(puzzle[i][j] == 1) cnt_c++;
                    else cnt_c = 0;
                    if(puzzle[j][i] == 1) cnt_r++;
                    else cnt_r = 0;

                    if(cnt_c == K) answer++;
                    if(cnt_r == K) answer++;
                    if(cnt_c == K+1) answer--;
                    if(cnt_r == K+1) answer--;
                }
                cnt_c = 0;
                cnt_r = 0;
            }

            System.out.println("#" + t + " " + answer);
        }
    }
}