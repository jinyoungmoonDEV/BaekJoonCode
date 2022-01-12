package Step3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class num8393 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		int s = 0;
		for(int i = 0; i <= n; i++) s+=i;
		System.out.println(s);
	}

}
