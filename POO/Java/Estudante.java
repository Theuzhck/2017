class Estudante{
	private String nome;
	private int creditos;
	private int matricula;
	
	public int getCreditos(){
		return creditos;
	}
	public String getNome(){
		return nome;
	}
	public int getMatricula(){
		return matricula;
	}
	void setCred(int cred){
		creditos+=cred;
	}
	void setNome(String nom){
		nome = nom;
	}
	void setMatricula(int mat){
		matricula = mat;
	}

}