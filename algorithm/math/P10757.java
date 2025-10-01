import java.math.*;
import java.util.*;

public class P10757 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BigInteger N = sc.nextBigInteger();
		BigInteger M = sc.nextBigInteger();
		
		BigInteger ans = N.add(M);
		
		System.out.print(ans);

        sc.close();
		
		
	}
}
