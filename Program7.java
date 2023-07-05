package PatternBasic;
import java.util.*;
public class Program7 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int num = 1;
		for(int i =0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((num++)+" ");
			}
			System.out.println();
		}
		s.close();
	}
}
