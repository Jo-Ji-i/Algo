import java.util.*;

public class Solution {

    private static final int[] dx = {0, 1, 0, -1};
    private static final int[] dy = {1, 0, -1, 0};

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int t=1; t<=T; t++){
            int N = sc.nextInt();
            int[][] arr = new int[N][N];
            int num = 1;

            int x = 0;
            int y = 0;
            int d = 0;

            for(int n=1; n<=N*N; n++){
                // right
                arr[x][y] = n;

                int nx = x + dx[d];
                int ny = y + dy[d];

                if(nx == N || ny == N || nx == -1 || ny == -1 || arr[nx][ny] != 0){
                    d = (d +1) % 4;
                    nx = x + dx[d];
                    ny = y + dy[d];
                    if(nx == N || ny == N || nx == -1 || ny == -1 || arr[nx][ny] != 0) break;
                }
                x = nx;
                y = ny;
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