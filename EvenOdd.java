import java.util.Scanner;
public class EvenOdd {
	public static void main(String args[])
	{
		int n,i,even=0,odd=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter the element in the array : ");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(arr[i]%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		System.out.println("Even element in the array is : "+even);
		System.out.print("Odd element in the array is : "+odd);
	}
}
