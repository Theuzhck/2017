
import java.io.Serializable;

/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  The exits are labelled north, 
 * east, south, west.  For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */
public class Room implements Serializable
{
    private String description;
    private Room northExit;
    private Room southExit;
    private Room eastExit;
    private Room westExit;
    private Room upExit;
    private Room downExit;
    private Item porcao;
    private boolean existeporcao;
    private int indicemonstro;
    private boolean existemonstro;

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    /*Dois construtores: um para criar sala com porção e outro para se existemontro*/
    public Room(String description, boolean existeporcao) 
    {
        this.description = description;
        if(existeporcao){
            this.setExisteporcao(true);
            this.setExistemonstro(false);
            this.setIndicemonstro(0);
        }
        else{
            this.setExisteporcao(false);
            this.setExistemonstro(false);
            this.setIndicemonstro(0);
        }
       
 
    }
    public Room (String description, boolean existemonstro, int indicem){
        this.description= description;
        if(existemonstro){
            this.setExistemonstro(true);
            this.setIndicemonstro(indicem);
            this.setExisteporcao(false);
        }
        else{
            this.setExistemonstro(false);
            this.setIndicemonstro(0);
            this.setExisteporcao(false);
        }
        
    }

    public Boolean getExisteporcao() {
        return existeporcao;
    }

    public void setExisteporcao(Boolean existeporcao) {
        this.existeporcao = existeporcao;
    }

    public boolean getExistemonstro() {
        return existemonstro;
    }

    public void setExistemonstro(boolean existemonstro) {
        this.existemonstro = existemonstro;
    }
    
    
    public Item getPorcao() {
        return porcao;
    }

    public void setPorcao(Item porcao) {
        this.porcao = porcao;
    }

    public int getIndicemonstro() {
        return indicemonstro;
    }

    public void setIndicemonstro(int indicemonstro) {
        this.indicemonstro = indicemonstro;
    }
    
    public void adicionarItem(int tipo){
        Item porcaonova = new Item(tipo);
        this.porcao=porcaonova;
    }
    


    /**
     * Define the exits of this room.  Every direction either leads
     * to another room or is null (no exit there).
     * @param north The north exit.
     * @param east The east east.
     * @param south The south exit.
     * @param west The west exit.
     */
    

    public void setExits(Room north, Room east, Room south, Room west, Room up, Room down) {
        if(north != null)
            northExit = north;
        if(east != null)
            eastExit = east;
        if(south != null)
            southExit = south;
        if(west != null)
            westExit = west;
        if(up != null)
            upExit = up;
        if(down != null)
            downExit = down;
    }

    /**
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }
    public Room getExit(String direction){
        if(direction.equalsIgnoreCase("north")){
            return northExit;
        }
        if(direction.equalsIgnoreCase("south")){
            return southExit;
        }
        if(direction.equalsIgnoreCase("east")){
            return eastExit;
        }
        if(direction.equalsIgnoreCase("west")){
            return westExit;
        }
        if(direction.equalsIgnoreCase("up")){
            return upExit;
        }
        if(direction.equalsIgnoreCase("down")){
            return downExit;
        }
        return null;
        
    }

}
