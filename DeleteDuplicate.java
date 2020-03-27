/*import java.util.Scanner;
public class DeleteDuplicate {
	public static void main(String args[])
	{
		int n,i,j;
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
			for(j=i+1;j<n;)
			{
				if(arr[i]==arr[j])
				{
					for(int k=j;k<n;k++)
					{
						arr[k]=arr[k+1];
					}
				}
				
				else 
				{
				j++;
				}
				n--;
			}
		}
		System.out.println("Array after deleting duplicate element: ");
		for(i=0;i<n;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}
*/
import java.util.Scanner;

public class DeleteDuplicate{
	public static void main(String[] args){
		/* Array instantiation */
		int[] arr_elements = new int[20];

		/* initial_element variable initialize by 0 and 
		point to the first element of the array */
		/* next_element points to next element of array */ 
		int initial_element,next_element;
		int i;
		
		/*Create Scanner Object */
		Scanner sc = new Scanner(System.in);
		
		/*Display array size for user*/
		System.out.print("Enter array size: ");
		int arr_size = sc.nextInt();
		
		/*Display message for array element*/
		System.out.println("Read Array Elements From User :");

		/*Loop to take input array elements*/
		for(i=0;i<arr_size;++i)
		{
			System.out.print("Enter array elements of index " +i +": ");
			arr_elements[i] = sc.nextInt();
		}

		/* Display array before removing duplicate element */
		System.out.println("Before removing duplicate element array are :");

		/* Loop for displaying array elements */
		for(i=0;i<arr_size;++i)
		{
			System.out.println(arr_elements[i]);
		}

		/* Get new line
		System.out.println();
		/* Display array after removing duplicate array element */
		System.out.println("After removing duplicate element array are :");
		for(initial_element=0;initial_element<arr_size;++initial_element)
		{
			for(next_element=initial_element+1;next_element<arr_size;){
				/* if initial_element matches to next_element 
				then take next _element and matches till end */
				if(arr_elements[initial_element] == arr_elements[next_element]){
					for(int temp = next_element; temp<arr_size; ++temp){
						arr_elements[temp] = arr_elements[temp+1];
					}
					arr_size = arr_size-1;		
				}		
				else
					next_element++;		
			}
		}
		
		/* Loop to display array after removing duplicate element */
		for(i=0;i<arr_size;++i)
			System.out.println(arr_elements[i]);
	}
}