public class Ponto{
	private double x;
	private double y;

	public Ponto(){
		x=0;
		y=0;
	}

	public Ponto(double xis, double ipslon){
		x = xis;
		y = ipslon;
	}

	void setX(double ent){
		x = ent;
	}

	public double getX(){
		return x;
	}

	void setY(double entra){
		y = entra;
	}

	public double getY(){
		return y;
	}

	public void imprime(){
		System.out.println("(" + x + ", " + y + ")");
	}

	public void deslocamentoPontoMedio(double xis, double ipslon){
		double x1 = (x+xis)/2;
		double y1 = (y+ipslon)/2;
		System.out.println("Ponto alvo: (" + x1 + ", " + y1 + ")");
	}

	
}