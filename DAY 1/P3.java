class P3 {

    public static void main(String[] args) {
        int i,j;

        for(i=1;i<=Integer.parseInt(args[0]);i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}