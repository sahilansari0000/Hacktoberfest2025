import java.util.Scanner;
class Alpha
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter alphha:");
		int val=sc.nextInt();
		for(int i=val; i<=90; i++)
		{
			System.out.println("Alphabet:"+(char)i+": "+i);
		}

	}
}
