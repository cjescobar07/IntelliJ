package replitHW;

public class Replit67_NestedForLoop {

	public static void main(String[] args) {
		

		for (int i = 1; i<=5; i++){
			 
			   for (int j = 1; j<=10; j++){
			    System.out.print(j*i + " ");
			  }
			  System.out.println();
			}
		
		
		System.out.println("----------------------------------");
		for (int i = 1; i<=4; i++){
			  
			for (int j = 1; j<=4; j++){
			  if (i == 1 || i == 3 || j == 4 || j == 2)
			  System.out.print("$");
			  
			}
			  System.out.println();

			}
		
		System.out.println("-------------------------------");
		
		
		
		int n = 4;
		for (int i = 1; i<=n; i++){ 			
		
		for (int j = 1; j<=n; j++) {
		  if (i == 1 || j == 1 || i == n || j == n)
			System.out.print("$");
		  else {
			  System.out.print(" ");
		  }
		}
		System.out.println();
		}
		  


		
	}
}
