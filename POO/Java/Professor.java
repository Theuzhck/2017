import java.io.BufferedOutputStream;
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class Professor implements Serializable{
	private String nome;
	private int matricula;
	private double salario;

	public Professor(String nom, int mat, double sal){
		nome = nom;
		matricula = mat;
		salario = sal;
	}

	void setNome(String nom){
		nome = nom;
	}
	public String getNome(){
		return nome;
	}

	void setMatricula(int mat){
		matricula = mat;
	}
	public int getMatricula(){
		return matricula;
	}

	void setSalario(double sal){
		salario = sal;
	}

	public double getSalario(){
		return salario;
	}

	public void escritor(Professor prof) throws FileNotFoundException, IOException{
                ObjectOutputStream objectOut = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("professores.data")));			
                objectOut.writeObject(prof);
                objectOut.close();
	}
}