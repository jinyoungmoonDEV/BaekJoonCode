package Step3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class num2439 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 1; i < N; i++) {
			System.out.print(" ");
		}
		for(int j = 1; j <= N-j; j++) {
			System.out.print("*");
		}
			System.out.print('\n');	
	}
}	

