import java.util.Scanner;
class MainConselhoProfessores{
	public static void main (String[] args){
		Scanner reader = new Scanner(System.in);
		ConselhoProfessores prof = new ConselhoProfessores();

		System.out.print("Nome, matricula e salario do professor a ser adicionada: "); 
		String nom = reader.nextLine();
		int mat = reader.nextInt();
		double sal = reader.nextDouble();
		prof.addProfessor(nom, mat, sal);

		System.out.print("Nome, matricula e salario do professor a ser adicionada: "); 
		String t = reader.nextLine(); //Sem essa linha, o cmd ignora a primeira entrada de dados
		nom = reader.nextLine();
		mat = reader.nextInt();
		sal = reader.nextDouble();
		prof.addProfessor(nom, mat, sal);

		System.out.print("Nome, matricula e salario do professor a ser adicionada: "); 
		t = reader.nextLine(); //Sem essa linha, o cmd ignora a primeira entrada de dados;
		nom = reader.nextLine();
		mat = reader.nextInt();
		sal = reader.nextDouble();
		prof.addProfessor(nom, mat, sal);

		System.out.print("Qual professor deseja verificar?");
		t = reader.nextLine(); //Sem essa linha, o cmd ignora a primeira entrada de dados;
		String show = reader.nextLine();
		if (prof.hasProfessor(show)){
			System.out.println("Tem!");
		}else{
			System.out.println("Nao tem!");
		}

					
		System.out.println("Qual professor deseja excluir?");
		String del = reader.nextLine();
		prof.removeProfessor(del);

		System.out.println("Todos os professores:");
		prof.listProfessor();

	}
	}
					