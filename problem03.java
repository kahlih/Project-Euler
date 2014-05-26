public class problem03
{
	public static void main(String[] args)
	{
		long num=600851475143L;

		int div=2;
		while (num>1)
		{
			if (num%div==0)
			{
				num=num/div;
			}
			else
			{
				div++;
			}
		}
		System.out.println("Largest Prime is " + div);
	}
}
