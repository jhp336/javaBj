import java.util.Scanner;

public class Main_24416 {
	public static int cnt1=0, cnt2=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		fiv(n);
		fibonacci(n);
		System.out.println(cnt1+" "+cnt2);
	}
	public static int fiv(int n) {
		if(n==1||n==2) {
			cnt1++;
			return 1;
		} else {
			return fiv(n-1)+fiv(n-2);
		}
	}
	public static int fibonacci(int n) {
		int[] f = new int[n];
		f[0] = 1;
		f[1] = 1;
		for (int i = 2; i < n; i++) {
			f[i] = f[i-1] + f[i-2];
			cnt2++;
		}
		return f[n-1];
	}
}