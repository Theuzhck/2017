import java.util.Scanner;

class MainNumberDisplay{
	public static void main (String[] args){
		Scanner reader = new Scanner(System.in);
		NumberDisplay horas = new NumberDisplay(24);
		NumberDisplay minutos = new NumberDisplay(60);		
		NumberDisplay segundos = new NumberDisplay(60);

		System.out.print("Passar o tempo... "); 
		String passa = reader.nextLine();
		horas.increment();	
		System.out.print("Defina o minuto inicial: "); 
		int min = reader.nextInt();
      	minutos.setValue(min);
      	minutos.increment();
      	System.out.print("Agora sao "+ horas.getDisplayValue()+": "+ minutos.getDisplayValue()+"(com formatacao)\n");
		System.out.print("Agora sao "+ horas.getValue()+": "+ minutos.getValue()+"(sem formatacao)");
      
   }
 }