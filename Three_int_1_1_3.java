
import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;


public class Three_int_1_1_3
{
	public static void main(String[] args)
	{
		int[] a = new int[3];
		for (int i = 0; i < 3; i++)
		{
			a[i] = StdIn.readInt();
		}
		if (a[0] == a[1] && a[1] == a[2])
			StdOut.println("equal");
		else 
			StdOut.println("not equal");
	}
}
