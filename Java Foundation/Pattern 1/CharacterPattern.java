import java.util.*;
public class CharacterPattern{
	public static void main(String[] args){
		int n = new Scanner(System.in).nextInt();
		for(int i=1;i<=n;i++){
			char x = (char)('A'+i-1);
			for(int j=1;j<=i;j++){
				System.out.print(x++);
			}
			System.out.println();
		}
	}
}