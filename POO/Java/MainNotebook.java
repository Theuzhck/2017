import java.util.Scanner;
class MainNotebook{
	public static void main (String[] args){
		Scanner reader = new Scanner(System.in);
		Notebook notes = new Notebook();

					System.out.print("Nota a ser adicionada: "); 
					String add = reader.nextLine();
					notes.storeNote(add);
					System.out.print("Nota a ser adicionada: "); 
					add = reader.nextLine();
					notes.storeNote(add);
					System.out.print("Nota a ser adicionada: "); 
					add = reader.nextLine();
					notes.storeNote(add);

					System.out.println("Nota a ser comparada:");
					add = reader.nextLine();
					if(notes.compareNote(add)){
						System.out.println("Essa nota ja esta guardada!");
					}else{
						System.out.println("Essa nota nao esta guardada!");
					}
				
					System.out.println("Total de notas salvas: "+ notes.numberOfNotes());
				
					System.out.println("Qual nota deseja ver?");
					int show = reader.nextInt();
					notes.showNote(show);

					System.out.println("Qual nota deseja excluir?");
					int del = reader.nextInt();
					notes.removeNote(del);

					System.out.println("Mostrar todas:");
					notes.listNotes();

					if (notes.hasNotes()){
						System.out.println("Tem notas!");
					}else{
						System.out.println("Não tem notas!");
					}

					System.out.print("Nota aleatoria: ");
					notes.showNoteRandom();
		}
	}
					