import java.util.Scanner;
class FormatoNotas{
	public static void main (String[] args){
		Scanner reader = new Scanner(System.in);
		Notebook note1 = new Notebook();

		System.out.println("O que deseja fazer? (add; qtd; mostrar; excluir; Exit)");
		String resp = reader.nextLine();
		while (!resp.equals("exit")){
				if (resp.equals("add")){
					System.out.print("Nota a ser adicionada: "); 
					String add = reader.nextLine();
					note1.storeNote(add);
					System.out.println("O que deseja fazer? (add; qtd; mostrar; excluir; Exit)");
					resp = reader.nextLine();
				}
				
				if (resp.equals("qtd")){
					System.out.println("Total de notas salvas: "+ note1.numberOfNotes());
					System.out.println("O que deseja fazer? (add; qtd; mostrar; excluir; Exit)");
					resp = reader.nextLine();
				}
				
				if (resp.equals("mostrar")){
					System.out.println("Qual nota você deseja ver?");
					int show = reader.nextInt();
					note1.showNote(show);
					System.out.println("O que deseja fazer? (add; qtd; mostrar; excluir; Exit)");
					resp = reader.nextLine();
				}
				
				if (resp.equals("excluir")){
					System.out.println("Qual nota você deseja excluir?");
					int del = reader.nextInt();
					note1.removeNote(del);
					System.out.println("O que deseja fazer? (add; qtd; mostrar; excluir; Exit)");
					resp = reader.nextLine();
				}
				if (resp.equals("exit")){
					break;
				}
		}
   }
 }