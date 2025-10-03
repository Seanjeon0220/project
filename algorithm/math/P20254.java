import java.util.*;

public class P20254 {
	
	static int A, B, C, D, ans;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		sc.close();
		
		ans = 56*A + 24*B + 14*C + 6*D;
		System.out.print(ans);
	}

}
