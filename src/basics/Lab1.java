package basics;

public class Lab1 {

	public static void main(String[] args) {
		// Write a functions that takes a value N and returns the sum of 1 to n
		System.out.println(sum(9));
		
		System.out.println("**************");
		
		// Write a function that computes factorial *hint: use recursion, n = n*(n-1)! = n*(n-1)*(n-2)! = n*(n-1)*(n-2)*(n-3)!...
		System.out.println("Factorial: " + fact(3));
		
		System.out.println("**************");
		
		//Write 3 functions that return the minimum, average and maximum of an aray
		int[] numbers = {-65, -2, 0, 256, -500, 456};
		System.out.println("Min: " + findMin(numbers));
		System.out.println("Max: " + findMax(numbers));
		System.out.println("Avg: " + findAvg(numbers));
		
	}
	
	public static int sum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			System.out.print(sum + " + " + i);
			sum = sum + i;
			System.out.println(" = " + sum);
		}
		return sum;
	}
	
	public static int fact(int n) {
		if (n == 0) {
			return 1;
		}
		System.out.println(n);
		return n * fact(n-1);
	}
	
	public static int findMin(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}

		}
		return min;
	}
	
	public static int findMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}

		}
		return max;
	}
	
	public static double findAvg(int[] arr) {
		// Take sum, divide by number of elements
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum: " + sum + " ArrLength: " + arr.length);
		return sum/arr.length;
	}

}
