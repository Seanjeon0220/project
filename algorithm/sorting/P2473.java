import java.io.*;
import java.util.*;

public class P2473 {
    static long[] arr;
    static int best[] = new int[3];
    static int start, mid, end;
    static long min = Long.MAX_VALUE;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        arr = new long[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(arr);

        for (int i = 0; i < n - 2; i++) {
            start = i;
            mid = i + 1;
            end = n - 1;
            while (mid < end) {
                long sum = arr[start] + arr[mid] + arr[end];
                if (min > Math.abs(sum)) {
                    min = Math.abs(sum);
                    best[0] = start;
                    best[1] = mid;
                    best[2] = end;
                }
                if (sum == 0) {
                    break;
                } else if (sum > 0) {
                    end--;
                } else {
                    mid++;
                }
            }
        }
        System.out.println(arr[best[0]] + " " + arr[best[1]] + " " + arr[best[2]]);
    }
}