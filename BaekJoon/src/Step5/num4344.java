package Step5;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class num4344 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr;
		int C = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for(int i = 0; i < C; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			arr = new int[N];
			
			double sum = 0;
			
			for(int j = 0; j < N; j++) {
				int val = Integer.parseInt(st.nextToken());
				arr[j] = val;
				sum += val;
			}
			
			double mean = (sum / N);
			double count = 0;
			
			for(int j = 0; j < N; j++) {
				if(arr[j] > mean) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n", (count/N)*100);
		}
	}

}
