import java.util.Scanner;

class Solution{
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
	
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[][] arr = new int[N][N];
			int total = 0;
			int max = -1;
			
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			int[] dx = new int[M*M];
			int[] dy = new int[M*M];
			int num = 0;
			
			for(int i=0; i<M; i++) {
				for(int j=0; j<M; j++) {
					dx[num++] = i;
				}
			}
			
			num = 0;
			
			for(int i=0; i<M; i++) {
				for(int j=0; j<M; j++) {
					dy[num++] = j;
				}
			}
			
	
			for(int i=0; i<=N-M; i++) {
				for(int j=0; j<=N-M; j++) {
					for(int k=0; k<M*M; k++) {
						total += arr[i+dx[k]][j+dy[k]];
					}
					if(max < total) max = total;
					total = 0;
				}
			}
			
			System.out.println("#"+ t+ " " + max);
		}
	}
}