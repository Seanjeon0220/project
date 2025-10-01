import java.util.*;
import java.math.*;
 
public class P13277 {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BigInteger N = sc.nextBigInteger();
		BigInteger M = sc.nextBigInteger();
		BigInteger ans = N.multiply(M);
		
		System.out.print(ans);
		sc.close();
	}
 
}