import java.util.Scanner;
public class MainReader02{
      public static void main(String args[])    { 
        String strN1, strN2;
  		  int n1,n2, somaInt;
		    Scanner reader;
    		reader = new Scanner(System.in);
		    System.out.print("entre com um inteiro > "); 
      	strN1 = reader.nextLine();
    		System.out.print("entre com outro inteiro > "); 
      	strN2 = reader.nextLine();
		    n1 = Integer.parseInt(strN1);
  		  n2 = Integer.parseInt(strN2);
    		somaInt = n1 + n2;
		    System.out.println ("soma = " + somaInt); 
      }  
}
