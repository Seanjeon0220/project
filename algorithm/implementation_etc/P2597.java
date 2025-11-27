import java.util.Scanner;

public class P2597 {
    static class Pair {
        double first;
        double second;

        Pair(double first, double second) {
            this.first = first;
            this.second = second;
        }
    }

    static Pair[] arr = new Pair[3];

    static double update(double mid, double num) {
        return mid + Math.abs(mid - num);
    }

    static void func(int idx, double[] lr) {
        if (arr[idx].first == arr[idx].second) {
        	return;
        }

        double mid = (arr[idx].first + arr[idx].second) / 2;

        for (int i = idx + 1; i < 3; i++) {
            arr[i].first = update(mid, arr[i].first);
            arr[i].second = update(mid, arr[i].second);
        }

        lr[0] = update(mid, lr[0]);
        if (lr[0] > lr[1])
            lr[1] = lr[0];
        lr[0] = mid;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double len = sc.nextDouble();
        double[] lr = {0, len};

        for (int i = 0; i < 3; i++) {
            arr[i] = new Pair(sc.nextDouble(), sc.nextDouble());
        }

        for (int i = 0; i < 3; i++) {
            func(i, lr);
        }

        double res = lr[1] - lr[0];
        res *= 10;
        res = Math.floor(res);
        res /= 10;

        System.out.printf("%.1f", res);

        sc.close();
    }
}
