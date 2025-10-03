import java.util.*;
import java.math.*;

public class P15964 {
		
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		
		BigInteger ans = (a.add(b)).multiply((a.subtract(b)));
		System.out.print(ans);

        sc.close();
	}
}
