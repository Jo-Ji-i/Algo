import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Solution{
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String[] score = {"A+", "A0", "A-", "B+", "B0", "B-","C+", "C0", "C-", "D0"};
		
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			
			double[] total = new double[N];
			double k_score = 0.0;
			int rank = 0;
			String result = "";
			
	
			for(int i=0; i<N; i++) {
				double x1 = sc.nextInt()*0.35;
				double x2 = sc.nextInt()*0.45;
				double x3 = sc.nextInt()*0.20;
				double sum = x1+x2+x3;
				total[i] = sum;
				if(i == K-1) k_score = sum;
			}
				
			Arrays.sort(total);
			
			for(int i=0; i<N; i++) {
				if(k_score == total[i]) {
				rank = N-i-1;
				break;
				}
			}
			result=score[rank/(N/10)];
			
			System.out.println("#" + t + " " + result);
							
		}
		
	}
}