import java.util.Scanner;
public class PostiveNegative {
		public static void main(String args[])
		{
			int n,i,pos=0,neg=0;
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
				if(arr[i]>=0)
				{
					pos++;
				}
				else
				{
					neg++;
				}
			}
			System.out.println("Positive element in the array is : "+pos);
			System.out.print("Negative element in the array is : "+neg);
		}
}
