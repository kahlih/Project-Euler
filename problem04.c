int main()
{
	int max = -1;int i=100;int j=100;int prod;
	for (i=0;i<1000; i++)
	{
		for (j=0;j<1000;j++)
		{
			prod=i*j;
			if (isPal(prod) && prod>max)
				max=prod;
		}
	}
	if (max==-1)
		
}
