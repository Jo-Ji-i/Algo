
import java.util.*;

public class Solution {

    public static int[][] rotation(int[][] arr, int N){
        int[][] result = new int[N][N];

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                result[i][j] = arr[N-(j+1)][i];
            }
        }
        return result;
    }

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int t=1; t<=T; t++){
            int N = sc.nextInt();
            int[][] arr = new int[N][N];
            int[][] arr_90 = new int[N][N];
            int[][] arr_180 = new int[N][N];
            int[][] arr_270 = new int[N][N];
            StringBuilder sb = new StringBuilder();
            int check = 2;

            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    arr[i][j] = sc.nextInt();
                }
            }

            arr_90 = rotation(arr, N);
            arr_180 = rotation(arr_90, N);
            arr_270 = rotation(arr_180, N);

            System.out.println("#" + t);
            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    System.out.print(arr_90[i][j]);
                }
                System.out.print(" ");
                for(int j=0; j<N; j++){
                    System.out.print(arr_180[i][j]);
                }
                System.out.print(" ");
                for(int j=0; j<N; j++){
                    System.out.print(arr_270[i][j]);
                }
                System.out.println();
            }
        }
    }
}