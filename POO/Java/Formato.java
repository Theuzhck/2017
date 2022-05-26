import java.util.Scanner;
class Formato{
	public static void main (String[] args){
		Scanner reader = new Scanner(System.in);
		String resp = "comece";
		while  (resp.equals("comece")){
			System.out.println("O que deseja fazer? (Um; Varios; Dado; Limite; Min e Max; Exit)");
			resp = reader.nextLine();
				if (resp.equals("um")){
					RandomTester num1 = new RandomTester();
					System.out.println("Um aleatorio: "+ num1.printOneRandom()); 	
					System.out.println("Restart or exit?");
					String sup = reader.nextLine();
					if (sup.equals("restart")){
						resp = "comece";
					}else if (sup.equals("exit")){
						break;
					}
				}
				
				if (resp.equals("varios")){
					RandomTester num2 = new RandomTester();
					System.out.print("Qts aleatorios: "); 
					int many = reader.nextInt();
					num2.printMultiRandom(many);	
					System.out.println("Restart or exit?");
					String sup = reader.nextLine();
					if (sup.equals("restart")){
						resp = "comece";
					}else if (sup.equals("exit")){
						break;
					}
				}
				
				if (resp.equals("dado")){
					RandomTester num3 = new RandomTester();
					System.out.println("Girando o dado..."+ num3.throwDice());
					System.out.println("Restart or exit?");
					String sup = reader.nextLine();
					if (sup.equals("restart")){
						resp = "comece";
					}else if (sup.equals("exit")){
						break;
					}
				}
				
				if (resp.equals("limite")){
					RandomTester num4 = new RandomTester();
					System.out.print("Um aleatorio ate quanto? ");
					int max = reader.nextInt();
					System.out.println(num4.throwMax(max));	
					System.out.println("Restart or exit?");
					String sup = reader.nextLine();
					if (sup.equals("restart")){
						resp = "comece";
					}else if (sup.equals("exit")){
						break;
					}
				}
				
				if (resp.equals("min e max")){
					RandomTester num5 = new RandomTester();
					System.out.print("Um aleatorio de quanto ate quanto? ");
					int maxi = reader.nextInt();
					int mini = reader.nextInt();
					System.out.println(num5.throwMinMax(mini, maxi));
					System.out.println("Restart or exit?");
					String sup = reader.nextLine();
					if (sup.equals("restart")){
						resp = "comece";
					}else if (sup.equals("exit")){
						break;
					}
				}
		}
      
   }
 }