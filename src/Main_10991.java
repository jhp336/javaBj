
import java.util.Scanner;

public class Main_10991 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			
			for (int j = i; j < N-1 ; j++) {
				sb.append(' ');	
			}
			if(i == N-1 || i == 0) {
				for (int j = 0; j < 2*i + 1; j++) {
					sb.append('*');	
				}
			}
			else {
				sb.append('*');
				for (int j = 0; j < 2*i - 1; j++) {
					sb.append(' ');	
				}
				sb.append('*');
			}
			sb.append('\n');
			
		}
		System.out.println(sb);
	}

}
