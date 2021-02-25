package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		
		String[] names = {"bob", "sara", "jan", "sven", "joe"};
		
		names[3] = "hugo";
		System.out.println(names[3]);
		
		
		String[] nameList = new String[60000000];
		nameList[456] = "nero";
		System.out.println(nameList[0]);
		
		int[] nums = new int[100000];
		
//		for(int i = 0; i < nums.length; i++) {
//			System.out.println(nums[i]);
//		}
		
		//2. print the third element in the array
		System.out.println(names[2]);
		//3. set the third element to a different value
		names[2]="john";
		//4. print the third element again
		System.out.println(names[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		//6. make an array of 50 integers
		int[] a = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < a.length; i++) {
			Random r = new Random();
			a[i]=r.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		//8. without printing the entire array, print only the smallest number in the array
		int smol = a[0];
		for (int i = 1; i < a.length; i++) {
			if(a[i]<smol) {
				smol=a[i];
			}
		}
		System.out.println("Smol = " + smol);
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
		int big = 0;
		for (int i = 1; i < a.length; i++) {
			if(a[i]>big) {
				big=a[i];
				
			}
			
		}
		System.out.println("big = " + big);
	}
}
