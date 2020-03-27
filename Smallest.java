import java.util.Scanner;
public class Smallest {
		public static void main(String args[])
		{
			int n,i,min;
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the size of array : ");
			n=sc.nextInt();
			int arr[]=new int[n];
			System.out.print("Enter the element in array : ");
			for(i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			min=arr[0];
			for(i=0;i<n;i++)
			{
				if(min>arr[i])
				{
					min=arr[i];
				}
			}
			System.out.print("Minimum element in array is : "+min);
		}
}

