import java.util.Scanner;

class Solution{
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] arr = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		
	
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			int[] result = new int[arr.length];
			
			for(int i=0; i<arr.length; i++) {
				
				if(N - arr[i] < 0) continue;
				else {
					int x = N/arr[i];
					result[i] = x;
					N = N-(x*arr[i]);
				}
			}
			
			System.out.println("#" + t);
			for(int i=0; i<result.length; i++) {
				System.out.print(result[i] + " ");
			}
			System.out.println();
			
		}
		
	}
}