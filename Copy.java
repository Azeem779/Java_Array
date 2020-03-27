import java.util.Scanner;
public class Copy {
	public static void main(String args[])
	{
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		n=sc.nextInt();
		int arr[]=new int[n];
		int cpy[]=new int[n];
		System.out.print("Enter the element in Array: ");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			cpy[i]=arr[i];
		}
		System.out.print("Copied Array is : ");
		for(i=0;i<n;i++)
		{
			System.out.print(cpy[i] +" ");
		}
	}
}
