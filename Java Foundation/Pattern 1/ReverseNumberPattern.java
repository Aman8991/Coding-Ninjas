
import java.util.*;
public class ReverseNumberPattern{
	public static void main(String[] args){
		int n = new Scanner(System.in).nextInt();
		for(int i=1;i<=n;i++){
			for(int j=i;j>0;j--){
				System.out.print(j);
			}
			System.out.println();
		}
	}
}