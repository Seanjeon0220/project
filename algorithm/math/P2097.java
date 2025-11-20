import java.util.*;

public class P2097 {
    public static int square_range(int pebbles) {
        int i = 0;
        while (Math.pow(i, 2) < pebbles) {
            i++;
        }
        return i;
    }

    public static int min_circumference(int num, int pebbles) {
        if ((num - 1) * num > pebbles) {
            return (num - 2 + num - 1) * 2;
        } else {
            return (num - 1) * 4;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pebbles = scanner.nextInt();

        if (pebbles == 0) {
            System.out.println(0);
        } else if (pebbles == 1) {
            System.out.println(4);
        } else {
            int temp = square_range(pebbles);
            int circumference = min_circumference(temp, pebbles);
            System.out.println(circumference);
        }

        scanner.close();
    }
}


