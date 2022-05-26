import java.util.Scanner;

class MAque{
	public static void main (String[] args){
		Scanner reader = new Scanner(System.in);
		Aquecedor12 temp1 = new Aquecedor12();
		Aquecedor12 temp2 = new Aquecedor12();
		Aquecedor12 temp3 = new Aquecedor12();

		System.out.print("entre com a temperatura a aumentar "); 
		double aumenta = reader.nextDouble();
      	temp1.maisMorno(aumenta);
      	System.out.print("entre com a temperatura a subtrair "); 
		double diminue = reader.nextDouble();
      	temp2.maisFrio(diminue);
      	System.out.print("entre com a temperatura a substituir "); 
		double modi = reader.nextDouble();
      	temp3.setTemperatura(modi);




       System.out.println(temp1.getTemperatura() + ";\n" + temp2.getTemperatura() +";\n" + temp3.getTemperatura()+";");
   }
 }