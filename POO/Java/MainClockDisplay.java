import java.util.Scanner;

class MainClockDisplay{
	public static void main (String[] args){
		Scanner reader = new Scanner(System.in);
		ClockDisplay relogio1 = new ClockDisplay();
		ClockDisplay relogio2 = new ClockDisplay();


		System.out.print("Começando a contagem... \n"); 
		relogio1.timeTick();
		System.out.print("Defina a hora e o minuto inicial desse outro relogio: "); 
		int h = reader.nextInt();
		int m = reader.nextInt();
      	relogio2.setTime(h,m);
      	System.out.print("Agora sao "+ relogio1.getTime()+"(relogio1)\n");
		System.out.print("Agora sao "+ relogio2.getTime()+"(relogio2)");
      
   }
 }