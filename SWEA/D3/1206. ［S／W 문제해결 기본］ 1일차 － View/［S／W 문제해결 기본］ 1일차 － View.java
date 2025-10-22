import java.util.*;

class Solution{
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T = 10;
		
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt(); 
			int[] H = new int[N+1];
			int[] di = {-2, -1, 1, 2};
			long total = 0;
			
			for(int i=0; i<N; i++) {
				H[i] = sc.nextInt();
			}

			for(int i=2; i<N-1; i++) {
				int L1, L2, R1, R2 = 0;
				int L, R = 0;
				
				L1 = H[i] - H[i-2];
				L2 = H[i] - H[i-1];
				if(L1 > 0 && L2 > 0) L = (L1 < L2? L1 : L2);
				else L = 0;
				
				R1 = H[i] - H[i+1];
				R2 = H[i] - H[i+2];
				if(R1 > 0 && R2 > 0) R = (R1 < R2? R1: R2);
				else R = 0;
				
				total = (L < R? total+L: total+R);
				
			}
			
			System.out.println("#" + t + " " + total);
			
		}
		
	}
}