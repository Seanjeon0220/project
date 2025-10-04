import java.util.*;
import java.math.*;

public class P24309 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BigInteger A = sc.nextBigInteger();
		BigInteger B = sc.nextBigInteger();
		BigInteger C = sc.nextBigInteger();
		
		BigInteger temp = B.subtract(C);
		BigInteger ans = temp.divide(A);
		
		System.out.print(ans);
		sc.close();
	}
}
