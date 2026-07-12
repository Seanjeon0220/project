import java.util.HashSet;
import java.io.*;

public class P25192 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        HashSet<String> enterMember = new HashSet<>();

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        while(N --> 0) {
            String str = br.readLine();

            if(str.equals("ENTER")) {
                count += enterMember.size();
                enterMember.clear();
                continue;
            }
            enterMember.add(str);
        }
        count += enterMember.size();
        
        sb.append(count);
        bw.write(sb.toString());
        br.close();
        bw.flush();
        bw.close();
    }
}