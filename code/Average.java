/*
Find average of a number array between two limit numbers (except the two numbers)
Input:
5: 1 2 3 4 5
1 4

Output:
2
 */
import java.util.*;
class Average {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of Array Element");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter Array Element: ");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter limit 1: ");
		int limit1=sc.nextInt();
		System.out.print("Enter limit 2: ");
		int limit2=sc.nextInt();
		int sum=0;
		int count=0;
		for(int i=0;i<n;i++){
           if(arr[i]>limit1 && arr[i]<limit2){
           	sum+=arr[i];
           	count+=1;
           }
		}
		if(count!=0){
			int avg=sum/count;
		System.out.println("Average is: "+avg);
		}
		else{
			System.out.println("Average not possible");
		}
		
	}
}