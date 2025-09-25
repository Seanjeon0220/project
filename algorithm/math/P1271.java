import java.util.Scanner;
import java.math.BigInteger;

public class P1271 {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BigInteger N = sc.nextBigInteger();
		BigInteger M = sc.nextBigInteger();
		sc.close();
		
		System.out.println(N.divide(M));
		System.out.println(N.remainder(M));
	}
 
}