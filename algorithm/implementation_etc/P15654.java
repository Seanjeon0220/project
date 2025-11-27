import java.util.*;
import java.io.*;

public class P15654 {
	
	static int N, M;
	static int[] arr;
	static int[] printArr;
	static boolean[] isVisited;
	
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		
		arr = new int[N];
		printArr = new int[N];
		isVisited = new boolean[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		Arrays.sort(arr);
		
		dfs(0, 0);
	}
	
	static void dfs(int startIdx, int depth) {
		if(depth == M) {
			for(int i=0; i<M; i++) {
				System.out.print(printArr[i]+" ");
			}
			System.out.println();
			return;
		}
		
		for(int i=0; i<N; i++) {
			if(!isVisited[i]) {
				isVisited[i] = true;
				printArr[depth] = arr[i];
				dfs(i + 1, depth + 1);
				isVisited[i] = false;
			}
		}
		
	}
}