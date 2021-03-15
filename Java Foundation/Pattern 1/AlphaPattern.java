import java.util.*;
public class AlphaPattern{
	public static void main(String[] args){
		int n = new Scanner(System.in).nextInt();
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){
				System.out.print((char)('A'+i));
			}
			System.out.println();
		}
	}
}