import java.util.Scanner;

public class Main_15649 {
	public static int[] arr;
	public static boolean[] check;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		arr = new int[m];
		check = new boolean[n];
		find(n, m, 0);
		
	}
	public static void find(int n, int m, int cnt) {
		if(cnt == m) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
		for(int i = 0; i < n; i++) {
			if(check[i]==false) {
				check[i]=true;
				arr[cnt] = i+1;
				find(n, m, cnt+1);
				check[i]=false;
			}
		}
	}
}
