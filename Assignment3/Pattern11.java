class Pattern11
{
	public static void main(String args[])
	{
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}									
			for (int k=i;k<=5;k++)
			{
				System.out.print("*");
					
			}
			for(int l=i+1;l<=5;l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}	
	}	
}
