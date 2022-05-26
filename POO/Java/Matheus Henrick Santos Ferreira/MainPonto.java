import java.util.Scanner;
class MainPonto{
	public static void main (String[] args){
		Scanner reader = new Scanner(System.in);
		Ponto p1 = new Ponto();
		Ponto p2 = new Ponto();
		Ponto p3 = new Ponto(10,10);

		System.out.println("Valor de p1: (" + p1.getX()+", "+ p1.getY()+")"); 
		
		System.out.print("Defina os valores de p2 (x, y): ");
		double x = reader.nextDouble();
		double y = reader.nextDouble();
		p2.setX(x);
		p2.setY(y);
		System.out.print("Novo valor de p2: "); 
		p2.imprime();

		System.out.print("Valor de p3: "); 
		p3.imprime();
		
		System.out.print("Digite o ponto para calcular o ponto medio com p1"); 
		double xis = reader.nextDouble();
		double ipslon = reader.nextDouble();
		p1.deslocamentoPontoMedio(xis, ipslon);
      	
   }
 }