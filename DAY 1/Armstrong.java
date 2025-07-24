class Armstrong
{
	public static void main(String[] args)
	{
			int n = Integer.parseInt(args[0]);
			int copy = n;
			int sum=0,d;
			while(copy>0)
			{
				d=copy%10;
				sum+=(d*d*d);
				copy/=10;
			}
			if(sum==n)
			{
				System.out.println("Armstrong number");
			}
			else
			System.out.println("Not Armstrong number");

	}
}