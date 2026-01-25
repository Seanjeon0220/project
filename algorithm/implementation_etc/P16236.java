import java.util.*;
import java.io.*;

public class P16236 {

	static int N;
	static int[][] map;
	static int[][] dist;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int size = 2;
	static int eat = 0;
	static int cnt = 0;
	static int sharkX = -1;
	static int sharkY = -1;
	static int minX, minY, minDist;
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		
		map = new int[N][N];
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0; j<N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				
				if(map[i][j] == 9) {
					sharkX = i;
					sharkY = j;
					map[i][j] = 0;
				}
			}
		}
		
		while(true) {
			dist = new int[N][N];
			minX = Integer.MAX_VALUE;
			minY = Integer.MAX_VALUE;
			minDist = Integer.MAX_VALUE;
			
			bfs(sharkX, sharkY);
			
			if(minX != Integer.MAX_VALUE && minY != Integer.MAX_VALUE) {
				eat++;
				map[minX][minY] = 0;
				sharkX = minX;
				sharkY = minY;
				cnt += dist[minX][minY];
				
				if(eat == size) {
					size++;
					eat = 0;
				}
			} else {
				break;
			}
		}
		
		System.out.println(cnt);
	}
	
	static void bfs(int x, int y) {
		Queue<Pos> que = new LinkedList<>();
		que.add(new Pos(x, y));
		
		while(!que.isEmpty()) {
			
			Pos p = que.poll();
			
			int curX = p.x;
			int curY = p.y;
			
			for(int t=0; t<4; t++) {
				int nx = curX + dx[t];
				int ny = curY + dy[t];
				if(isArea(nx, ny) && isAblePos(nx, ny) && dist[nx][ny] == 0) {
					dist[nx][ny] = dist[curX][curY] + 1;
					
					if(isEat(nx, ny)) {
						if(minDist > dist[nx][ny]) {
							minDist = dist[nx][ny];
							minX = nx;
							minY = ny;
						} else if(minDist == dist[nx][ny]) {
							if(minX == nx) {
								if(minY > ny) {
									minX = nx;
									minY = ny;
								}
							} else if(minX > nx) {
								minX = nx;
								minY = ny;
							}
						}
					}
					
					que.add(new Pos(nx, ny));
				}
			}
			
		}
	}
	
	static boolean isArea(int x, int y) {
		return x >= 0 && y >= 0 && x < N && y < N;	
	}
	
	static boolean isEat(int x, int y) {
		return map[x][y] != 0 && map[x][y] < size;
	}
	
	static boolean isAblePos(int x, int y) {
		return map[x][y] <= size;
	}
	
	static class Pos{
		int x, y;
		
		Pos(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
}