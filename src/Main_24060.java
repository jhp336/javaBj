import java.util.Scanner;

public class Main_24060 {
	static int N, K, CNT = 0, ANS = -1;
	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);
		N=scann.nextInt();
		K=scann.nextInt();
		int [] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scann.nextInt();
		}
		merge_sort(arr,0,arr.length-1);
		System.out.println(ANS);
	}
	static void merge_sort(int[] a, int p, int r) {
		int q;
		if(p<r) {
			q = (p+r)/2;
			merge_sort(a, p, q);  
	        merge_sort(a, q + 1, r);  
	        merge(a, p, q, r);
		}
	}
	static void merge(int[] a, int p, int q, int r) {
		int i = p, j = q+1, t = 0;
		int [] tmp = new int[r-p+1];
		while(i<=q&&j<=r) {
			if(a[i]<=a[j]) {
				tmp[t++] = a[i++];
			}else {
				tmp[t++] = a[j++];
			}
		}
		while(i<=q) {
			tmp[t++] = a[i++];
		}
		while(j<=r) {
			tmp[t++] = a[j++];
		}
		i = p;
		t = 0;
		while(i<=r) {
			a[i++] = tmp[t++];
			CNT++;
			if(CNT == K) {
				ANS = a[i-1];
			}
		}
		
	}
}   