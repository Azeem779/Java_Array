import java.util.Scanner;
public class Search {
	public static void main(String args[])
	{
		int n,i,search,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter the element in Array: ");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter the element you want to search : ");
		search=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(search==arr[i])
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.print("Number is fount in the array.");
		}
		else
		{
			System.out.print("Number is not Found.");
		}
	}
}
