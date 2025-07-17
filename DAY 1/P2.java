class P2 {
    
	public static void main(String[] args)
	{
		int a=-1,b=1,c,i;
		for(i=1;i<=30;i++)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}	
	}
}
