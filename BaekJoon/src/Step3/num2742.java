package Step3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class num2742 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		for(int i = 0; i< N; i++) {
			System.out.println(N - i);
		}
	}

}
