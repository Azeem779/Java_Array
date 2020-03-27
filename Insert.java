import java.util.Scanner;
public class Insert {
	public static void main(String args[])
	{
		int i,num,pos,val;
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
		System.out.print("Enter the value you want to insert : ");
		val=sc.nextInt();
		for(i=(num-1);i>=(pos-1);i--)
		{
			arr[i+1]=arr[i];
		}
		arr[pos-1]=val;
		System.out.print("Updated array is: ");
		for(i=0;i<num;i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.print(arr[num]);
	}
}
