package group12_ProjectTasks;

public class Group12_Task05 {

	public static void main(String[] args) {
		// Write a program to swap 2 numbers without a temporary variable
		
		int x = 22;
		int y = 7;
		
		System.out.println("Before swapping variables: " + " x = " + x + " , y = " + y);
		System.out.println();
		
		x = x + y; // x = 22(x) + 7(y) = 29(x)
		y = x - y; // y = 29(x) - 7(y) = 22(y)
		x = x - y; // x = 29(x) - 22(y) = 7(x)
		
		System.out.println("After swapping variables: " + " x = "+ x + ", y = " + y);
		System.out.println("---------------------------------------------");
		
		// Write a program to swap 2 numbers without a temporary variable
		
		int a = 2022;
		int b = 2021;
		 
		System.out.println("Before swapping variable: " + "a = " + a + ", b = " + b);
		
		a = a * b; // 2022(a) * 2021(b) = 4,086,462
		b = a / b; // 4,086,462(a) / 2021(b) = 2022
		a = a / b; // 4,086,462(a) / 2022(b) = 2021
		
		System.out.println();
		System.out.println("After swapping variable: " + "a = " + a +", b = " + b);
		
		
		
		
		
		
		
		
	}
}
