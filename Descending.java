import java.util.Scanner;
public class Descending {
		public static void main(String args[])
		{
			int n,i,j,temp;
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
					if(arr[i]<arr[j])
					{
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			System.out.print("Array in Descending order : ");
			for(i=0;i<n;i++)
			{
				System.out.print(arr[i] + " ");
			}
		}
	}
