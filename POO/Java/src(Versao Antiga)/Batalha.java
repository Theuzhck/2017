/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angel Of Dead
 */
public class Batalha {
    private Parser parser;
    private Avatar player;
    private Monstro monster;
    
    public Batalha(Avatar play1, Monstro mons1){
       this.player = play1;
       this.monster = mons1;
       parser = new Parser();  
    }
    
    public boolean iniciarBattle(){
        
        System.out.println("Começa a Batalha entre "+player.getNick()+" e "+ monster.getNick());
        System.out.println("Digite o comando attack para lutar");
        boolean h=battle();
        if(h)
            System.out.println("O Jogador foi vitorioso!");
        else
            System.out.println("Você Morreu!");
        
        return h;
    }
    
    public boolean battle(){
        boolean finished = false;
        while (!finished) {
            Command command = parser.getCommand();
            boolean process=processCommand(command);
            finished = fimBatalha();
        }
        if(player.isLife())
            return true;
        else 
            return false;
       
    }
    
    private boolean processCommand(Command command) 
    {
        if(command.isUnknown()) {
            System.out.println("I don't know what you mean...");
            return false;
        }

        String BattleCommands = command.getCommandWord();
        switch (BattleCommands) {
            case "attack":
                int damage=player.attack();
                monster.takeDamage(damage);
                damage-=monster.getDef();
                System.out.println("Você tirou "+damage+" de dano!");
                player.status();
                monster.status();
                System.out.println("");
                if(!fimBatalha()){
                    damage=monster.attack();
                    player.takeDamage(damage);
                    damage-=player.getDef();
                    System.out.println("Você recebeu "+damage+" de dano!");
                    player.status();
                    monster.status();
                    System.out.println("");
                }    
                break;
            case "defense":
                // metodo def
                break;
            default:
                System.out.println("Use apenas os Comandos de batalha: attack e defense");
                break;
        }
        return true;
    }
    
    public boolean fimBatalha(){
        if (player.isLife() && !monster.isLife()){
            return true;
        }
        return !player.isLife() && monster.isLife();
    }
    
    
}
