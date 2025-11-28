import java.io.*;
import java.util.*;

public class P29155 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] level = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        List<int[]> exam = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[]{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
            exam.add(arr);
        }

        Collections.sort(exam, (a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(a[1], b[1]);
            }
            return Integer.compare(a[0], b[0]);
        });

        int res = 0;
        int beforeLevel = 1;
        int beforeTime = 0;
        boolean firstClear = true;

        for (int[] pair : exam) {
            int i = pair[0];
            int j = pair[1];

            if (level[i - 1] > 0) {
                res += j;
                level[i - 1]--;

                if (firstClear) {
                    firstClear = false;
                } else if (beforeLevel == i) {
                    res += (j - beforeTime);
                } else if (beforeLevel != i) {
                    res += 60;
                }

                beforeLevel = i;
                beforeTime = j;
            }
        }

        sb.append(res);

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
