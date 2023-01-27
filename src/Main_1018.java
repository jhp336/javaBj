import java.util.Scanner;

public class Main_1018 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, M;
		N = sc.nextInt();
		M = sc.nextInt();
		char [][] arr = new char[N][M];
		for(int i = 0;i < N;i++) {
			String s = sc.next();
			for(int j = 0;j < M; j++) {
				arr[i][j] = s.charAt(j);
			}
		}
		int min = 65, cnt;
		for(int i = 0;i <= N-8;i++) {
			for(int j = 0;j <= M-8; j++) {
				cnt = 0;
				for(int k = 0;k < 8;k++) {
					for(int l = 0;l < 8; l++) {
						if((arr[i+k][j+l]!='B'&&(k+l)%2 == 0) ||(arr[i+k][j+l]!='W'&&(k+l)%2 == 1)) {
							cnt++;
						}
					}
				}
				if(cnt>32) {
					cnt = 64-cnt;
				}
				if(cnt<min) {
					min = cnt;
				}
			}
		}
		System.out.println(min);
	}
	
}   
