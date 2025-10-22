import java.util.*;

class Solution{
	
	public static int max(int[] arr) {
		int max = 0;
		int idx = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) { max = arr[i]; idx=i; }
		}
		return idx;
	}
	
	public static int min(int[] arr) {
		int min = 101;
		int idx = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < min) { min = arr[i]; idx=i; }
		}
		return idx;
	}
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T = 10;
		
		for(int t=1; t<=T; t++) {
			int dump = sc.nextInt();
			int[] box = new int[100];
			
			for(int i=0; i<box.length; i++) {
				box[i] = sc.nextInt();
			}
			
			for(int i=0; i<dump; i++) {
				box[max(box)]--;
				box[min(box)]++;
			}
			
			System.out.println("#" + t + " " + (box[max(box)] - box[min(box)]));
			
		}
		
	}
}