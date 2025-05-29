package task22;
import java.util.*;

public class Dicer {

	public static void main(String[] args) {
		Random rand=new Random();
		int result=0;
		while(true) {
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter 10 to roll the dice");
			int n=sc.nextInt();
			if(n==10) {
				int dicenum=rand.nextInt(1,7);
				System.out.println("Dice value=" +dicenum);
				if (dicenum==1) {
					System.out.println("You are out of the game!!!");
					System.out.println("Final Score"+result);
					break;
				}
				result+=dicenum;
			
				
			}
			
		}
	}

}
