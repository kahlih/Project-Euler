/* Incomplete Implementaion */
public class problem01{
public static void main(String args[])
{
	int sum = 0;
	for(int i=0; i<1000; i++)
	{
		if((i%3 == 0) || (i%5 ==0))
		{
			sum+=i;
		}
	}
	System.out.println("The sum of all multiples of 3 or 5 below 1000 is " + sum);
	System.out.print("\n");
}
}
