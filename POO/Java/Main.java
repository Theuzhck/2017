import util.java.Scanner;

class Main{
	public static void main (String[] args){
		Scanner reader;
		reader = new Scanner(System.in);
		Estudante aluno1 = new Estudante();
		Estudante aluno2 = new Estudante();
		Estudante aluno3 = new Estudante();
		Estudante aluno4 = new Estudante();

		System.out.print("entre com o nome do aluno "); 
      	String nom = reader.nextLine();
      	aluno1.setNome(nom);
		System.out.print("entre com o nome do aluno "); 
      	nom = reader.nextLine();
      	aluno2.setNome(nom);
      	System.out.print("entre com o nome do aluno "); 
            nom = reader.nextLine();
      	aluno3.setNome(nom);
      	System.out.print("entre com o nome do aluno "); 
      	nom = reader.nextLine();
      	aluno4.setNome(nom);
		

		System.out.print("entre com a qtde de creditos > "); 
      	int cred = reader.nextInt();
      	aluno1.setCred(cred);
		System.out.print("entre com a qtde de creditos > "); 
      	cred = reader.nextInt();
      	aluno2.setCred(cred);
      	System.out.print("entre com a qtde de creditos > "); 
            cred = reader.nextInt();
      	aluno3.setCred(cred);
      	System.out.print("entre com a qtde de creditos > "); 
      	cred = reader.nextInt();
      	aluno4.setCred(cred);

		

		System.out.println(aluno1.getNome() +": "+aluno1.getCreditos()+";\n" + aluno2.getNome() +": "+aluno2.getCreditos()+";\n"+ aluno3.getNome()+": "+aluno3.getCreditos()+";\n"+aluno4.getNome()+": "+aluno4.getCreditos()+";\n");
	}
}