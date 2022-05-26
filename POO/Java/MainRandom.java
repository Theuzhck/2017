import java.util.Scanner;
class MainRandom{
	public static void main (String[] args){
		Scanner reader = new Scanner(System.in);
		RandomTester num1 = new RandomTester();
		RandomTester num2 = new RandomTester();
		RandomTester num3 = new RandomTester();
		RandomTester num4 = new RandomTester();
		RandomTester num5 = new RandomTester();


		System.out.println("Um aleatorio: "+ num1.printOneRandom()); 

		System.out.print("Qts aleatorios: "); 
		int many = reader.nextInt();
		num2.printMultiRandom(many);

		System.out.println("Girando o dado..."+ num3.throwDice());

		System.out.print("Um aleatorio ate quanto? ");
		int max = reader.nextInt();
		System.out.println(num4.throwMax(max));

		System.out.print("Um aleatorio de quanto ate quanto? ");
		int maxi = reader.nextInt();
		int mini = reader.nextInt();
		System.out.println(num5.throwMinMax(mini, maxi));
		
		
      
   }
 }