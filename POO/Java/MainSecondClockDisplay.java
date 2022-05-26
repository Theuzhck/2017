import java.util.Scanner;
class MainSecondClockDisplay{
	public static void main (String[] args){
		Scanner reader = new Scanner(System.in);
		ClockDisplay relogio1 = new ClockDisplay();


		System.out.print("Começando a contagem... \n"); 
		System.out.print("O relogio inicia em "+ relogio1.getTime()+"\n");
		System.out.print("Defina a hora, o minuto e o segundo inicial desse relogio: "); 
		int h = reader.nextInt();
		int m = reader.nextInt();
		int s = reader.nextInt();
      	relogio1.setTime(h,m,s);
      	relogio1.timeTick();
      	System.out.print("Agora sao "+ relogio1.getTime()+"(relogio1)\n");
		
      
   }
 }