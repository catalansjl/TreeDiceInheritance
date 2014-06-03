import java.util.Scanner;
public abstract class clsInetheTest {
	
public static void main(String[] args) {
		// TODO Auto-generated method stub		

		TripleDice Tripledice = new TripleDice();
		
		System.out.printf("Type in the number of dice you want to be rolled.\n");
		
		Scanner input = new Scanner (System.in);
		
		int dices = input.nextInt();
		
		System.out.printf("%d dice have been rolled.\n", dices);
		
		int D = Tripledice.Throw(3);
		
		int avg = D/3;
				
		System.out.printf("they have an averge of %d", avg);			
		
	}
}


		
		
		
		
		
		
		
	