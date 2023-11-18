import java.util.Scanner;

class Solution{
	
	public static final int[] dx = {0, 0, 0, 1, 1, 1, 2, 2, 2};
	public static final int[] dy = {0, 1, 2, 0, 1, 2, 0, 1, 2};
	
	public static int match(int[][] arr) {
		int total = 0;
		
		for(int i=0; i<=6; i+=3){
			for(int j=0; j<=6; j+=3){
				for(int k=0; k<9; k++) {
					total += arr[i+dx[k]][j+dy[k]];
				}
				if(total != 45) {
					return 0;
				}else total = 0;
			}
		}
		return 1;
	}
	
	public static int match_rw(int[][] arr) {
		int toA = 0;
		int toB = 0; 
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				toA += arr[i][j];
				toB += arr[j][i];
			}
			if(toA != 45) {
				return 0;
			}else if(toB !=45) {
				return 0;
			}else {
				toA = 0;
				toB = 0;
			}
		}
		return 1;
	}
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
	
		for(int t=1; t<=T; t++) {
			int[][] arr = new int[9][9];
			int[] check = new int[10];
			int reA, reB = 1;
			
			for(int i=0; i<9; i++) {
				for(int j=0; j<9; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			reA = match(arr);
			reB = match_rw(arr);
			
			if(reA == 0 || reB == 0) System.out.println("#"+ t+ " " + 0);
			else System.out.println("#"+ t+ " " + 1);
		}
	}
}