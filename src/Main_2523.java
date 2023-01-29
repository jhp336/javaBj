
import java.util.Scanner;

public class Main_2523 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 2*N -1; i++) {
			if(i < N) {
				for (int j = 0; j < i + 1; j++) {
					sb.append("*");	
				}
				sb.append('\n');
			}else {
				for (int j = i; j < 2*N-1; j++) {
					sb.append("*");	
				}
				sb.append('\n');
			}
		}
		System.out.println(sb);
	}

}
