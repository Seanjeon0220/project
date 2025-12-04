import java.util.Scanner;

public class P16457 {
    static int n, m, k;
    static int[] quests;
    static int ans;

    static void bf(int i, int s, int bm) {
        if (s == n) {
            int quest_ctr = 0;
            for (int q = 0; q < m; ++q) {
                if ((bm & quests[q]) == quests[q]) { 
                    ++quest_ctr; 
                }
            }
            ans = Math.max(ans, quest_ctr); 
            return;
        }
        for (; i < 2 * n; ++i) {
            bf(i + 1, s + 1, bm | 1 << i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        k = scanner.nextInt();
        quests = new int[m];

        for (int q = 0; q < m; ++q) {
            int bitmask = 0;
            for (int j = 0; j < k; ++j) {
                int skill = scanner.nextInt();
                bitmask |= 1 << (skill - 1); // 1.
            }
            quests[q] = bitmask;
        }
        bf(0, 0, 0);
        System.out.println(ans);

        scanner.close();
    }
}
