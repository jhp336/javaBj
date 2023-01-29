
import java.util.Scanner;

public class Main_10994 {
	static int [][] star;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		star = new int[4*N-3][4*N-3];
		StringBuilder sb = new StringBuilder();
		
		star(2*(N-1),N);
		for (int i = 0; i < 4*N-3; i++) {
			for (int j = 0; j < 4*N-3; j++) {
				sb.append(star[i][j]==1 ? '*' : ' ');
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}
	public static void star(int r, int n) {
		if(n == 1) {
			star[r][r] = 1;
			return;
		}
		for (int i = r - 2*(n-1); i <= r + 2*(n-1); i++) {
			star[r - 2*(n-1)][i] = 1;
			star[r + 2*(n-1)][i] = 1;
			star[i][r - 2*(n-1)] = 1;
			star[i][r + 2*(n-1)] = 1;
		}
		star(r,n-1);
	}

}
