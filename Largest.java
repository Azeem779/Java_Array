import java.util.Scanner;
public class Largest {
	public static void main(String args[])
	{
		int n,i,max;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter the element in array : ");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		max=arr[0];
		for(i=0;i<n;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.print("Maximum element in array is : "+max);
	}
}
