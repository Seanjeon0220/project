import java.util.*;
import java.io.*;

public class P12851 {
	static Queue<Integer> que = new LinkedList<>();
	static int arr[] = new int[100001];

	static int N, K;
	static int min_time, count;
	static int next_time;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());

		if(N >= K) {
			System.out.println(N-K);
			System.out.println(1);
			return;
		}

		BFS();

		System.out.println(min_time);
		System.out.println(count);

	}

	public static void BFS() {
		min_time = Integer.MAX_VALUE/16;
		count = 0;
		que.offer(N);
		arr[N] = 1;

		while( !que.isEmpty() ) {
			int time = que.poll();

			if(min_time < arr[time]) {
				return;
			}

			for(int i=0; i<3; i++) {

				switch(i) {
					case 0: next_time = time + 1;
						break;
					case 1: next_time = time - 1;
						break;
					default : next_time = time * 2;
				}


				if(next_time == K) {
					min_time = arr[time];
					count ++;
				}
			
	
				if( Range_check() && (arr[next_time] == 0 || arr[next_time] == arr[time] + 1) ) {
					que.offer(next_time);
					arr[next_time] = arr[time] + 1;
				}

			}
		}


	}

	static boolean Range_check() {
		return (next_time >= 0 && next_time <= 100000);
	}


}