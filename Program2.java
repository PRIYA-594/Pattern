package PatternBasic;
import java.util.*;
public class Program2 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n  = s.nextInt();
		char c = s.next().charAt(0);
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}
		s.close();
	}
}
