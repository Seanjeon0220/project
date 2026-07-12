import java.io.*;
import java.util.*;
 
class City {
    int end;
    int weight;
 
    City(int end, int weight) {
        this.end = end;
        this.weight = weight;
    }
}
 
public class P1219 {
    static int N;
    static ArrayList<ArrayList<City>> a;
    static int[] addMoney;
    static long[] totalMoney;
    static final int INF = -987654321;
 
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
 
        N = Integer.parseInt(st.nextToken()); 
        int startCity = Integer.parseInt(st.nextToken());
        int endCity = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
 
        a = new ArrayList<>(); 
        for (int i = 0; i < N; i++) {
            a.add(new ArrayList<>());
        }
        
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
 
            a.get(start).add(new City(end, -weight));
        }
 
        addMoney = new int[N]; 
 
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            addMoney[i] = Integer.parseInt(st.nextToken());
        }
 
        String ans = "";
        if (!BFS(startCity, endCity)) { 
            ans = "gg";
        } else {
            totalMoney = new long[N]; 
 
            if (bellmanFord(startCity, endCity)) { 
                ans = "Gee";
            } else { 
                ans = String.valueOf(totalMoney[endCity]);
            }
        }
        
        sb.append(ans);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
 
    public static boolean BFS(int startCity, int endCity) {
        if (startCity == endCity) {
            return true;
        }
 
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[N];
        q.offer(startCity);
        visited[startCity] = true;
 
        while (!q.isEmpty()) {
            int now = q.poll();
 
            for (City c : a.get(now)) {
                if (!visited[c.end]) {
                    if (c.end == endCity) {
                        return true;
                    }
 
                    visited[c.end] = true;
                    q.offer(c.end);
                }
            }
        }
 
        return false;
    }
 
    public static boolean bellmanFord(int startCity, int endCity) {
        Arrays.fill(totalMoney, INF);
        totalMoney[startCity] = addMoney[startCity]; 
        boolean update = false;
        
        for (int i = 0; i < N - 1; i++) {
            update = false;
 
            for (int j = 0; j < N; j++) {
                for (City city : a.get(j)) {
                    if (totalMoney[j] == INF) {
                        break;
                    }
 
                    if (totalMoney[city.end] < totalMoney[j] + city.weight + addMoney[city.end]) {
                        totalMoney[city.end] = totalMoney[j] + city.weight + addMoney[city.end];
                        update = true;
                    }
                }
            }

            if (!update) {
                break;
            }
        }

        ArrayList<Integer> cycleNodeList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (City city : a.get(i)) {
                if (totalMoney[i] == INF) {
                    break;
                }
 
                if (totalMoney[city.end] < totalMoney[i] + city.weight + addMoney[city.end]) {
                    cycleNodeList.add(i);
                    cycleNodeList.add(city.end);
                }
            }
        }
 
        for (int i = 0; i < cycleNodeList.size(); i++) {
            if (BFS(cycleNodeList.get(i), endCity)) {
                return true;
            }
        }
        
        Arrays.fill(totalMoney, INF);
        totalMoney[startCity] = addMoney[startCity];
 
        for (int i = 0; i < N - 1; i++) {
            update = false;
            for (int j = 0; j < N; j++) {
                for (City city : a.get(j)) {
                    if (cycleNodeList.contains(j) || totalMoney[j] == INF) {
                        break;
                    }
 
                    if (cycleNodeList.contains(city.end)
                            || totalMoney[city.end] < totalMoney[j] + city.weight + addMoney[city.end]) {
                        totalMoney[city.end] = totalMoney[j] + city.weight + addMoney[city.end];
                        update = true;
                    }
                }
            }
 
            if (!update) {
                break;
            }
        }
 
        return false;
 
    }
 
}
