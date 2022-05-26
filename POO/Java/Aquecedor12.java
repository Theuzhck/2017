class Aquecedor12{
	private double temperatura;

	public Aquecedor12(){
		temperatura = 15.0;
	}
	public double getTemperatura(){
		return temperatura;
	}
	void setTemperatura(double temp){
		temperatura = temp;
	}
	void maisMorno(double valor){
		temperatura += valor;
	}
	void maisFrio(double valor){
		temperatura = temperatura - valor;
	}

}