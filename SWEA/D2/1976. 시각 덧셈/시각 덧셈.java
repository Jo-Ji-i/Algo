import java.util.Scanner;

class Solution{
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
	
		for(int t=1; t<=T; t++) {
			int c1 = sc.nextInt();
			int m1 = sc.nextInt();
			int c2 = sc.nextInt();
			int m2 = sc.nextInt();
			
			int rc = 0, rm = 0;
			
			rc = (c1+c2)%12;
			rm = (m1+m2)%60;
			if(m1+m2 >= 60) rc++;
			
			System.out.println("#" + t + " " + rc + " " + rm);
		}
	}
}