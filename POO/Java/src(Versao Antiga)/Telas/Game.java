
import java.util.Scanner;

/**
 *  This class is the main class of the "World of Zuul" application. 
 *  "World of Zuul" is a very simple, text based adventure game.  Users 
 *  can walk around some scenery. That's all. It should really be extended 
 *  to make it more interesting!
 * 
 *  To play this game, create an instance of this class and call the "play"
 *  method.
 * 
 *  This main class creates and initialises all the others: it creates all
 *  rooms, creates the parser and starts the game.  It also evaluates and
 *  executes the commands that the parser returns.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */

public class Game 
{
    private Parser parser;
    private Room currentRoom;
        
    /**
     * Create the game and initialise its internal map.
     */
    public Game() 
    {
        createRooms();
        parser = new Parser();
    }
    
    public void limparTela(){
        for(int i = 0; i < 100; i++){ 
           System.out.println("");
        } 
    }
    
    /**
     * Create all the rooms and link their exits together.
     */
    private void createRooms()
    {
        Room entrada, sala1, sala2, sala3, sala4, sala5,sala6, escada1;
        Room sala7,sala8,sala9,sala10,sala11,sala12,sala13,escada2;
        Room sala14;
      
        // create the rooms
        entrada = new Room("Entrada");
        sala1 = new Room("Sala 1");
        sala2 = new Room("Sala 2");
        sala3 = new Room("Sala 3");
        sala4 = new Room("Sala 4");
        sala5 = new Room("Sala 5");
        sala6 = new Room("Sala 6");
        escada1 = new Room("Escada para 1 andar");
        sala7 = new Room("Sala 7");
        sala8 = new Room("Sala 8");
        sala9 = new Room("Sala 9");
        sala10 = new Room("Sala 10");
        sala11 = new Room("Sala 11");
        sala12 = new Room("Sala 12");
        sala13 = new Room("Sala 13");
        escada2 = new Room("Escada para 2 andar");
        sala14 = new Room("Sala 14");
        // initialise room exits
        entrada.setExits(null, sala1, null, null,null,null);
        sala1.setExits(sala2, sala5, sala3, entrada,null,null);
        sala2.setExits(null, null, sala1, null,null,null);
        sala3.setExits(sala1, null, null, null,null,null);
        sala5.setExits(sala4, null, sala6, null,null,null);
        sala4.setExits(null, null, sala5, null,null,null);
        sala6.setExits(sala5,null,escada1,null,null,null);
        escada1.setExits(sala6,null,null,null,sala7,null);
        sala7.setExits(null, sala8, null, null,null,escada1);
        sala8.setExits(null, sala9, null, sala7,null,null);
        sala9.setExits(sala10, sala11, sala12, sala8,null,null);
        sala10.setExits(null, null, sala9, null,null,null);
        sala11.setExits(null, null, null, sala9,null,null);
        sala12.setExits(sala9, null, escada2, sala13,null,null);
        sala13.setExits(null,sala12,null,null,null,null);
        escada2.setExits(sala12,null,null,null,sala14,null);
        sala14.setExits(null, null, null, null, null, escada2);
        currentRoom = entrada;  // start game outside
    }

       
    public boolean battleground(Avatar player){
        boolean resultado;
        Monstro m1= new Monstro("Princesa Mariana",300,100,50);
        Batalha b1 = new Batalha(player,m1);
        resultado=b1.iniciarBattle();
        if(resultado)
           return true; 
        else
           return false;
        
    }
    
    /**
     *  Main play routine.  Loops until end of play.
     */
    public void play(Avatar player){            
        //player=creatPlayer(player);
        boolean result=battleground(player);
        // Enter the main command loop.  Here we repeatedly read commands and
        // execute them until the game is over.
        boolean finished = false;
        while (!finished && result) {
            Command command = parser.getCommand();
            finished = processCommand(command);
        }
        System.out.println("Obrigado por jogar.  Até a proxima jornada!.");
        
    }

    

    /**
     * Given a command, process (that is: execute) the command.
     * @param command The command to be processed.
     * @return true If the command ends the game, false otherwise.
     */
    private boolean processCommand(Command command) 
    {
        boolean wantToQuit = false;

        if(command.isUnknown()) {
            System.out.println("I don't know what you mean...");
            return false;
        }

        String commandWord = command.getCommandWord();
        if (commandWord.equals("help"))
            printHelp();
        else if (commandWord.equals("go"))
            goRoom(command);
        else if (commandWord.equals("quit"))
            wantToQuit = quit(command);
        else if (commandWord.equals("location"))
            printLocationInfo();
        return wantToQuit;
    }

    // implementations of user commands:

    /**
     * Print out some help information.
     * Here we print some stupid, cryptic message and a list of the 
     * command words.
     */
    private void printHelp() 
    {
        System.out.println("Hello Darkness my old friend");
        System.out.println("Você está na Caverna do Dragão, seu objetivo é encontrar o Dragão e derrota-lo!.");
        System.out.println();
        System.out.println("Seus comandos são:");
        System.out.println("   go quit help");
    }

    /** 
     * Try to go to one direction. If there is an exit, enter
     * the new room, otherwise print an error message.
     */
    private void goRoom(Command command) 
    {
        if(!command.hasSecondWord()) {
            // if there is no second word, we don't know where to go...
            System.out.println("Ir Aonde?");
            return;
        }

        String direction = command.getSecondWord();

        // Try to leave current room.
        Room nextRoom = null;
        if(direction!= null) {
            nextRoom = currentRoom.getExit(direction);
        }
        if (nextRoom == null) {
            System.out.println("Sala inexistente");
        }
        else {
            currentRoom = nextRoom;
            printLocationInfo();
            
        }
    }
    
    private void printLocationInfo(){
        System.out.println("Você está na " + currentRoom.getDescription());
        System.out.print("Portas: ");
        if(currentRoom.getExit("north") != null) {
            System.out.print("north ");
        }
        if(currentRoom.getExit("east") != null) {
            System.out.print("east ");
        }
        if(currentRoom.getExit("south") != null) {
            System.out.print("south ");
        }
        if(currentRoom.getExit("west") != null) {
            System.out.print("west ");
        }
        if(currentRoom.getExit("up") != null) {
            System.out.print("up ");
        }
        if(currentRoom.getExit("down") != null) {
            System.out.print("down ");
        }
        System.out.println();
    }

    /** 
     * "Quit" was entered. Check the rest of the command to see
     * whether we really quit the game.
     * @return true, if this command quits the game, false otherwise.
     */
    private boolean quit(Command command) 
    {
        if(command.hasSecondWord()) {
            System.out.println("Sair pra onde?");
            return false;
        }
        else {
            return true;  // signal that we want to quit
        }
    }
    
   }
