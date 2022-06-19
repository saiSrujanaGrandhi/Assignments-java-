package assignment_1;

public class Forloop_demo
{
	public static void main(String[] args) {
		for(int word=0;word==0;word++)
		{
		
		for(int i=0;i<=6;i++)
		{
			for(int j=0;j<=7-1;j++)
			{
			if(i==0||j==3)
			{
			System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}
			
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		for(int k=0;k<=6;k++)
		{
			for(int l=0;l<=7;l++)
			{
				if(k==0||k==3||k==6||l==0)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println(" ");
		}
		System.out.println("  ");
		for(int u=0;u<=6;u++)
		{
			for(int v=0;v<=7;v++)
			{
				if(u==6||v==0)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		for(int w=0;w<=6;w++)
		{
			for(int y=0;y<=6;y++)
			{
				if(y==0||y==6||w==6)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}
		System.out.println();
		for(int a=0;a<=6;a++)
		{
			for(int b=0;b<=6;b++)
			{
				if(a==0||a==3||a==6)
				{
					System.out.print("* ");
				}
				else if(a<6/2&&b==0)
				{
					System.out.print("* ");
				}
				else if(a>6/2&&b==6)
				{
					System.out.print("      *");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
		System.out.println();
		for(int c=0;c<=9;c++)
		{
			for(int d=0;d<=6;d++)
			{
				if(d==0||c==(5-d)||c==(3+d))
				{
					System.out.print(" "+"*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println(" ");
		}
		System.out.println();
		for(int m=0;m<=6;m++)
		{
			for(int n=0;n<=6;n++)
			{
				if(m==0||m==6||n==0||n==6)
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
		}
			
	}
	}

