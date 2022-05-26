import java.util.Random;
public class RandomTester {

	private Random aleatorio;

	public RandomTester(){
		aleatorio = new Random();	
	}
	

	public int printOneRandom(){
		int index = aleatorio.nextInt();
		return index;
	}

	public void printMultiRandom(int many){
		for (int i = 0; i < many; i++) {
			System.out.println(aleatorio.nextInt());
		}
	}

	public int throwDice(){
		int index = aleatorio.nextInt(6) + 1;
		return index;
	}

	public int throwMax(int max){
		int index = aleatorio.nextInt(max+1);
		return index;	
	}

	public int throwMinMax(int min, int max){
		int index = (aleatorio.nextInt(max+1-min))+min;
		return index;	
	}
}