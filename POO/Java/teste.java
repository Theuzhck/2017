import java.util.Random;
import java.util.Scanner;

public class teste {
	public static void main (String[] args){
		Scanner reader = new Scanner(System.in);
		Random randomGenerator = new Random();

		int index1 = randomGenerator.nextInt();
		int index2 = randomGenerator.nextInt(100);

		System.out.println(index1);
		System.out.print(index2);

	}	
}