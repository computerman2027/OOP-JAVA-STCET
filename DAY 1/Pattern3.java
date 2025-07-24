class Pattern3 {
    public static void main(String[] args) {
        int i,j;
	int h = Integer.parseInt(args[0]);
        for(i=1;i<=h;i++)
        {
	
		for(int sp = 1;sp<=h-i;sp++)
		{
			System.out.print(" ");
		}

            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
