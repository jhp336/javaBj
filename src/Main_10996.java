
import java.util.Scanner;

public class Main_10996 {
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			star(N);
		}
		System.out.println(sb);
	}

	static void star(int n) {
		for(int i = 0;i < (n+1) / 2; i++) {
			sb.append("* ");
		}
		sb.append('\n');
		
		for (int i = 0; i < n / 2; i++) {
			sb.append(" *");
		}
		sb.append('\n');
	}
	
}
