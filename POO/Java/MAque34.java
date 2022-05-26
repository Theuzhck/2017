import java.util.Scanner;

class MAque34{
	public static void main (String[] args){
		Scanner reader = new Scanner(System.in);
		Aquecedor34 temp1 = new Aquecedor34(5, 30, 10);
		Aquecedor34 temp2 = new Aquecedor34(10, 25, 13);
		Aquecedor34 temp3 = new Aquecedor34(9, 27, 10);

		System.out.print("Aumentar a temperatura? "); 
		String aumenta = reader.nextLine();
		temp1.maisMorno();	
		System.out.print("Diminuir a temperatura? "); 
		String diminue = reader.nextLine();
      	temp2.maisFrio();
      
       System.out.println(temp1.getTemperatura() + ";\n" + temp2.getTemperatura() +";");
   }
 }