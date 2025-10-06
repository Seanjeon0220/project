import java.io.*;

public class P26766 {
	
	static int N;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
        N = Integer.parseInt(br.readLine());
        br.close();
        
        for(int i=0 ; i<N ; i++) {
        	System.out.println(" @@@   @@@ ");
        	System.out.println("@   @ @   @");
        	System.out.println("@    @    @");
        	System.out.println("@         @");
        	System.out.println(" @       @ ");
        	System.out.println("  @     @  ");
        	System.out.println("   @   @   ");
        	System.out.println("    @ @    ");
        	System.out.println("     @     ");
        }
    }

}


 



 
 
  
   
