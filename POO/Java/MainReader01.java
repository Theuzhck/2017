import java.util.Scanner;
public class MainReader01{
      public static void main(String args[])    { 
      	Scanner reader;
		String inputLine;
		reader = new Scanner(System.in);
		System.out.print ("entre com um texto:");
		inputLine = reader.nextLine();
		System.out.println ("a entrada foi " + inputLine); 
     }  
 }
