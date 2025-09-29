import java.util.*;
import java.math.*;
 
public class P8437{
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	
        BigInteger total = sc.nextBigInteger();
        BigInteger diff = sc.nextBigInteger();
        BigInteger t = new BigInteger("2");
        
        
        BigInteger klaudia = (total.subtract(diff)).divide(t).add(diff);
        BigInteger natalia = (total.subtract(diff)).divide(t);
        
        System.out.println(klaudia);
        System.out.println(natalia);

        sc.close();
 
    }
}