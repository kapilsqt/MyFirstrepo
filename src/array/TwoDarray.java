package array;

public class TwoDarray {
	
	public static void main(String[] args) {
		
		String mob[][] = { 	{" Sam " , " Nokia " , " apple ", " red mi"},
							{" Sam " , " Nokia " , " apple ", " red mi"},
							{" Sam " , " Nokia " , " apple ", " red mi"},
							{" Sam " , " Nokia " , " apple ", " red mi"}
						};
						
		for(int i=0;i<=3;i++)			
		{
			for(int j=0;j<=3;j++)
			{
				System.out.print(mob[i][j]);
			}		
			System.out.println();
		}		
	}
}
