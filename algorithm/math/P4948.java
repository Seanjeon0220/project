import java.io.*;

public class P4948 {
	
	static boolean[] isPrime;
    
    static void isPrime(int n){ 
        isPrime = new boolean[n+1];
        
        for(int i = 0; i < isPrime.length; i++){
            isPrime[i] = true;
        }
        
        isPrime[0] = isPrime[1] = false;
        
        for(int i = 2; i <= Math.sqrt(n); i++){ 
            if(isPrime[i]){
                for(int j = i*i; j<= n; j += i){
                    isPrime[j] = false;
                }
            }
        }
    }
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			int temp = Integer.parseInt(br.readLine());
			if(temp == 0) {
				break;
			}else {
				int cnt = 0;
				isPrime(2*temp);
				for (int i=temp+1 ; i<=temp*2 ; i++) {
					if(isPrime[i]) {
						cnt++;
					}
				}
				sb.append(cnt+"\n");
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}