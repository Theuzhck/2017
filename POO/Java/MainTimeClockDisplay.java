import java.util.Scanner;

class MainTimeClockDisplay{
	public static void main (String[] args){
		Scanner reader = new Scanner(System.in);
		ClockDisplay relogio1 = new ClockDisplay();


		System.out.print("Começando a contagem... \n"); 
		System.out.print("O relogio inicia em "+ relogio1.getTime()+"\n");
		System.out.print("Defina a hora e o minuto inicial desse relogio: "); 
		int h = reader.nextInt();
		int m = reader.nextInt();
      	relogio1.setTime(h,m);
      	relogio1.hora();
      	System.out.print("Agora sao "+ relogio1.getTime()+"(relogio1)\n");
		
      
   }
 }