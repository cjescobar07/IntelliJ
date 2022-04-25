package Group12_ProjectTasks;

public class Group12_Task06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a java program to check whether a given number is prime or not?
		 */
		// if a number is not greater than 1 it is not prime
		// if a number is greater than 2 divide that number with all the numbers
		// and check if you get a remainder other than 0 if yes that number is
		//not prime
		int number=5;
		boolean isPrime=true;

		if(number>1) {
			for(int i=2;i<number;i++) {
				if(number%i==0) {
					isPrime=false;
					break;
				}
			}
		}else {
			isPrime=false;
		}

		System.out.println(number+"  isPrime "+isPrime);

	}
}
