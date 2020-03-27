import java.util.Scanner;
public class Delete {
	public static void main(String args[])
	{
		int i,num,pos;
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		num=sc.nextInt();
		int arr[]=new int[num+1];
		System.out.print("Enter the element in array : ");
		for(i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter the position where you want to insert number : ");
		pos=sc.nextInt();
		for(i=pos;i<num;i++)
		{
			arr[i]=arr[i+1];
		}
		num--;
		System.out.print("Updated array is: ");
		for(i=0;i<num;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}