import java.util.Scanner;

public class Main_2004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int cnt2 = 0, cnt5 = 0;
		cnt2 = calc(n,2)-calc(n-m,2)-calc(m,2);
		cnt5 = calc(n,5)-calc(n-m,5)-calc(m,5);

		System.out.println(Math.min(cnt2, cnt5));
	}
	public static int calc(int n, int d) {
		int cnt = 0;
		while(n >= d) {
			cnt = cnt + n/d;
			n = n /d;
		}
		return cnt;
	}

}
