class Aquecedor34{
	private double temperatura;
	private double min;
	private double max;
	private double incremento;

	public Aquecedor34(double mini, double maxi, double inc){
		temperatura = 15.0;
		min = mini;
		max = maxi;
		incremento = inc;
	}
	public double getTemperatura(){
		return temperatura;
	}
	void setTemperatura(double temp){
		temperatura = temp;
	}
	public double getMin(){
		return min;
	}
	void setMin(double mini){
		min = mini;
	}
	public double getMax(){
		return max;
	}
	void setMax(double maxi){
		max = maxi;
	}
	public double getIncremento(){
		return incremento;
	}
	void setIncremento(double inc){
		incremento = inc;
	}
	void maisMorno(){
		if (incremento<max){
			temperatura += incremento;
		}
	}
	void maisFrio(){
		if (incremento>min){
			temperatura-= incremento;
		}
	}

}