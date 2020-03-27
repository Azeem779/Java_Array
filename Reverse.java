import java.util.Scanner;
public class Reverse {
	public static void main(String args[])
	{
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter the element in array : ");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Reversed array is: ");
		for(i=n-1;i>=0;i--)
		{
			System.out.print(arr[i] + " ");
		}
	}
}
