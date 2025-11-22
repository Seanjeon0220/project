import java.util.Scanner;

public class P30457 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] cnt = new int[1010];
        int ans = 0;

        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            cnt[x]++;
        }

        for (int i = 1; i <= 1000; i++) {
            ans += Math.min(cnt[i], 2);
        }

        System.out.println(ans);

        scanner.close();
    }
}
