import java.util.Scanner;
public class EvenOddSum {
	public static void main(String args[])
	{
		int i,num,evensum=0,oddsum=0;
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		num=sc.nextInt();
		int arr[]=new int[num];
		System.out.print("Enter the element in array : ");
		for(i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<num;i++)
		{
			if(arr[i]%2==0)
			{
				evensum=evensum+arr[i];
			}
			else
			{
				oddsum=oddsum+arr[i];
			}
		}
		System.out.println("Sum of even element in the array is : "+evensum);
		System.out.print("Sum of odd element in the array is : "+oddsum);
	}
}
