package assignment_1;

public class For_loop_demo_2 {
	public static void main(String[] args) {
		
		for(int i=0;i<=6;i++)
		{
			for(int j=0;j<=6;j++)
			{
				if(i==0||i==6||j==5)
				{
					System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		for(int a=0;a<=6;a++)
		{
			for(int b=0;b<=6;b++)
			{
				if(b==0||b==6||a==b)
				{
					System.out.print("* ");
				}
				
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		for(int c=0;c<=6;c++)
		{
			for(int d=0;d<=6;d++)
			{
				if(c==0||c==3||c==6||d==0)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		for(int e=0;e<=6;e++)
		{
			for(int f=0;f<=6;f++)
			{
				if(f==0||f==6||e==6)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		for(int g=0;g<=6;g++)
		{
			for(int h=0;h<=6;h++)
			{
				if(g==0||h==0||h==6||g==6/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		for(int k=0;k<=6;k++)
		{
			for(int l=0;l<=6;l++)
			{
				if(l==0||k==0||l==6||k==6)
				{
					System.out.print("*");
				}
				
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		for(int m=0;m<=6;m++)
		{
			for(int n=0;n<=6;n++)
			{
				if(n==0||n==6||m==n)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
}