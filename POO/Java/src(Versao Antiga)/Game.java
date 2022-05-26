
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
    private Avatar player;
    private ColecaoMonstro colecao;  
    /**
     * Create the game and initialise its internal map.
     */
    public Game() 
    {
        createRooms();
        createMonster();
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
        entrada = new Room("Entrada",false,0);
        sala1 = new Room("Sala 1",true,1);
        sala2 = new Room("Sala 2",true,1);
        sala3 = new Room("Sala 3",false,0);
        sala4 = new Room("Sala 4",false,0);
        sala5 = new Room("Sala 5",true,1);
        sala6 = new Room("Sala 6",false,0);
        escada1 = new Room("Escada para 1 andar",false,0);
        sala7 = new Room("Sala 7",false,0);
        sala8 = new Room("Sala 8",false,0);
        sala9 = new Room("Sala 9",false,0);
        sala10 = new Room("Sala 10",false,0);
        sala11 = new Room("Sala 11",false,0);
        sala12 = new Room("Sala 12",false,0);
        sala13 = new Room("Sala 13",false,0);
        escada2 = new Room("Escada para 2 andar",false,0);
        sala14 = new Room("Sala 14",false,0);
        //Indicando as salas que conteram os monstros
        sala3.setIndicemonstro(0);
        sala6.setIndicemonstro(1);
        sala4.setIndicemonstro(2);
        sala1.setIndicemonstro(-1);
        sala2.setIndicemonstro(-1);
        sala5.setIndicemonstro(-1);
        sala6.setIndicemonstro(-1);
        
        
       
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
    
    private void createMonster(){
        Monstro m1 = new Monstro("Elfo",300,25,5);
        Monstro m2 = new Monstro("Orc",400,30,5);
        Monstro m3 = new Monstro("Bruxa",200,50,5);
        colecao = new ColecaoMonstro();
        colecao.inserir(m3);
        colecao.inserir(m2);
        colecao.inserir(m1);
    }

    
    private Avatar creatPlayer(Avatar player)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println();
        System.out.println("Bem Vindo a Caverna do Dragão!");
        System.out.println("Vamos criar o seu Avatar!");
        System.out.println("Digite o nome do seu Avatar");
        String nick = teclado.nextLine();       
        int classe=0;
        boolean h=false;
        while(h!=true){
            System.out.println("Digite um número ->Escolha uma Classe: 1-Guerreiro ; 2-Mago ; 3-Arqueiro");
            classe = teclado.nextInt();
            if (classe>0 && classe<4){
                h=true;
            }else{
                System.out.println("Número Invalido! Digite a Classe novamente!");
            }
        }
        if(classe==1){
            player= new Avatar(nick,"Guerreiro",500,50,60,15,60);
        }
        else if(classe==2){
            player= new Avatar(nick,"Mago",300,75,45,15,80);
        }
        else{
            player= new Avatar(nick,"Arqueiro",400,60,50,20,90);
        }
        limparTela();
        //Item invetario = new Item(player,100,5);
        System.out.println("Personagem Criado! Vamos iniciar sua aventura "+nick+"!");
        System.out.println("Seu objetivo:Encontre o Dragão Maligno, derrote-o e salve a princesa!");
        System.out.println("Escreva 'help' se você precisa de ajuda.");
        System.out.println();
        printLocationInfo();
        return player;
    }
    
    public boolean battleground(Avatar player, int indice){
        boolean resultado;
        Monstro m1 = colecao.pesquisar(indice);
        Batalha b1 = new Batalha(player,m1);
        resultado=b1.iniciarBattle();
        if(resultado){
           printLocationInfo();
           currentRoom.setExistemonstro(false);
           return true; 
        }
        else
           return false;
        
        
    }
    
    
    
    /**
     *  Main play routine.  Loops until end of play.
     */
    public void play() 
    {            
        Avatar player = null;
        this.player=creatPlayer(player);
        boolean result=true;
        // Enter the main command loop.  Here we repeatedly read commands and
        // execute them until the game is over.
        boolean finished = false;
        while (!finished && result) {
            Command command = parser.getCommand();
            finished = processCommand(command);
            if(currentRoom.getIndicemonstro()>=0 && currentRoom.getExistemonstro()){
                result = battleground(this.player, currentRoom.getIndicemonstro());
            }
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
        else if (commandWord.equals("inventario"))
            mostrarInventario();
        else if (commandWord.equals("location"))
            printLocationInfo();
        else if (commandWord.equals("S"))
            usarInventario();
        else if (commandWord.equals("N")){
            System.out.println("fechando inventário");
            printLocationInfo();
        }    
 
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
        System.out.println(" inventario go quit help");
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
        if(currentRoom.getExisteporcao() && player.getInventario().tamanho()<=4){
            Item porcao = currentRoom.getPorcao();
            player.getInventario().inserir(porcao);
            System.out.println("Você encontrou uma porção e ela está no seu inventário");
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
    
    public void mostrarInventario(){
        player.getInventario().listar();
        System.out.println("Deseja utilizar alguma porção? (S ou N)");
    }
    
    public void usarInventario(){
        System.out.println("Digite o indice correspondente do item");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Item porcao = player.getInventario().pesquisar(num);
        porcao.usarPocao(player);
        System.out.println("Você utilizou a Porção");
        player.getInventario().remover(num);
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
