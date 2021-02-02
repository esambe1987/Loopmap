package LoopMapPackage;
import java.util.Scanner; 
import java.util.ArrayList;
public class LoopMapMain {

	private static int i;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner (System.in);
		ArrayList<Integer> userNumberStorage = new ArrayList<>(5);
		
		for(int x = 0;x<5;x=x+1) {
			//ask for 5 numbers
			System.out.println("please enter a number");
			int number = userInput.nextInt();
			userNumberStorage.add(number);
			System.out.println(userNumberStorage);
			
			//We need to store the numbers like this: [1,2,3,4,5]
		}
		System.out.println(userNumberStorage);
		//store the numbers
		
		
		 int sum=0;
	       long pro=1;
	       int[] a = null;
		int max=a[0];
	       int min=a[0];
	       for(i=0;i<a.length;i++)
	       {
	           sum=sum+a[i];
	           pro=pro*a[i];
	           if(a[i]>max)
	           max=a[i];
	           if(a[i]<min)
	           min=a[i];


	       }
	       float avg=sum/a.length;
	       System.out.print("You entered");
	       for(i=0;i<a.length;i++)
	       {
	           System.out.print(","+a[i]);

	       }

	           System.out.println("\n The sum of those numbers is "+sum);
	           System.out.println("The product of those numbers is "+pro);
	           System.out.println("The largest number entered is"+max);
	           System.out.println("The smallest number entered is "+min);
	           System.out.println("The average of the numbers entered is "+avg);



	}

}
