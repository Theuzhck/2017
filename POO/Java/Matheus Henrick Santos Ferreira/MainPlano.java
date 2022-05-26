import java.util.Scanner;
class MainPlano{
	public static void main (String[] args){
		Scanner reader = new Scanner(System.in);
		Plano pontos = new Plano();

		pontos.addPonto(0,0);
		pontos.addPonto(1,2);
		pontos.addPonto(3,4);
		pontos.addPonto(5,7);
		pontos.addPonto(10,10);

		System.out.print("Qual ponto deseja verificar?");
		double x = reader.nextDouble();
		double y = reader.nextDouble();
		if (pontos.verificaPonto(x, y)){
			System.out.println("Ponto cadastrado!");
		}else{
			System.out.println("Ponto nao cadastrado!");
		}
					
		System.out.println("Qual ponto deseja excluir?");
		double xis = reader.nextDouble();
		double ipslon = reader.nextDouble();
		pontos.removePonto(xis, ipslon);
		
		System.out.println("Todos os pontos:");
		pontos.listPontos();

	}
	}
					