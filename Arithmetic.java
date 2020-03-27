import java.util.Scanner;
public class Arithmetic {
	public static void main(String args[])
	{
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		n=sc.nextInt();
		int arr[]=new int[n];
		int arr1[]=new int [n];
		int add[]=new int [10];
		System.out.print("Enter the element in First Array : ");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter the element in Second Array : ");
		for(i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			add[i]=arr[i]+arr1[i];
		}
		System.out.print("Addition of the array is : ");
		for(i=0;i<n;i++)
		{
			System.out.print(add[i] + " ");
		}
	}
}
