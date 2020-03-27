import java.util.Scanner;
public class Duplicate {
	public static void main(String args[])
	{
		int i,j,n,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter the element in Array: ");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
		}
		System.out.print("Total duplicate element in array is : "+count);
	}
}
