public class problem02
{
	public static void main(String[] args)
	{
		int sum = 0;
		for (int index = 0; fib(index) < 4000000; index++)
		{
			if (fib(index)%2==0)
			{
				sum += fib(index);
			}
		}
			System.out.println("The sum is " + sum);
	}
	public static int fib(int x)
	{
		if (x==0)
			return 0;
		else if (x==1)
			return 1;
		else
			return fib(x-1) + fib(x-2);
	}
}
