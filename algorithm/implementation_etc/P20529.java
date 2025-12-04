import java.io.*;
import java.util.*;

public class P20529 {
	
	static int T;
	
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int min = 12;
            int N = Integer.parseInt(br.readLine());
            int num = N > 32 ? 33 : N;
            String input_arr[] = new String[num];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < input_arr.length; i++) {
                input_arr[i] = st.nextToken();
            }

            outerLoop: for (int i = 0; i < input_arr.length; i++) {
                for (int j = i + 1; j < input_arr.length; j++) {
                    for (int k = j + 1; k < input_arr.length; k++) {
                        min = Math.min(min, get_Distance(input_arr[i], input_arr[j], input_arr[k]));
                        if (min == 0)
                            break outerLoop;
                    }
                }
            }
            sb.append(min+"\n");
            
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    static int get_Distance(String str1, String str2, String str3) {
        int distance = 0;
        for (int i = 0; i < 4; i++) {
            distance += str1.charAt(i) != str2.charAt(i) ? 1 : 0;
            distance += str2.charAt(i) != str3.charAt(i) ? 1 : 0;
            distance += str1.charAt(i) != str3.charAt(i) ? 1 : 0;
        }
        return distance;
    }
}