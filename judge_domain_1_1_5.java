import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;


public class judge_domain_1_1_5
{

	public static boolean judge(double a )
	{
		if (a<=1 && a >= 0)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args)
	{
		double x = StdIn.readDouble();
		double y = StdIn.readDouble();
		if (judge(x) && judge(y))
			StdOut.println("true");
		else 
			StdOut.println("false");
	}
}
