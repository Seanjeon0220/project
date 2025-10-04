import java.util.*;
import java.math.*;

public class P24082 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BigInteger N = sc.nextBigInteger();
		BigInteger temp = N.multiply(N).multiply(N);
		
		System.out.print(temp);
		sc.close();
	}

}
