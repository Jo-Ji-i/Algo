import java.util.Scanner;

class Solution{
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		StringBuilder sb = new StringBuilder();
	
		for(int i=1; i<=N; i++) {
			String s = String.valueOf(i);
			String[] str = s.split("");
			int check=0;
			for(int j=0; j<str.length; j++) {
				int x = Integer.parseInt(str[j]);
				if(x==3 || x==6 || x==9) sb.append("-"); 
				else check++;
			}
			if(check == str.length) sb.append(i);
			sb.append(" ");
		}
		
		System.out.println(sb.toString());
		
	}
}