import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Notebook
{
    // Campo para um número arbitrário de notas.
    private ArrayList<String> notes;
    private Random aleatorio; 
    /**
     * Realiza qualquer inicialização que seja 
     * necessária para o bloco de notas.
     */
    public Notebook()
    {
        notes = new ArrayList<String>();
        aleatorio = new Random();
        
    }

    public void storeNote(String note)
    {
        notes.add(note);
    }
    public int numberOfNotes(){

        return notes.size();
    }

    public void showNote(int noteNumber)
    {
    if(noteNumber < 0) {
        System.out.println("Este nao e um numero de nota valido.") ;
    }
    else if(noteNumber < numberOfNotes()) {
        System.out.println(notes.get(noteNumber));
    }
    else {
        System.out.println("Este nao e um numero de nota valido.") ;
    }
    }

    public void removeNote(int noteNumber)
    {
    if(noteNumber < 0) {
        System.out.println("Este nao e um numero de nota valido.") ;
    }
    else if(noteNumber < numberOfNotes()) {
               notes.remove(noteNumber);
    }
    else {
        System.out.println("Este nao e um numero de nota valido.") ;
    }
    }

    public void listNotes()
    {
    Iterator it = notes.iterator();
    while(it.hasNext()) {
        System.out.println(it.next());
        }
    }

    public boolean hasNotes(){
    Iterator it = notes.iterator();
    if(it.hasNext()) {
        return true;
    }else{
        return false;
        }
    }

    public boolean compareNote(String compare){
        Iterator it = notes.iterator();
        boolean ok = false;
        while(it.hasNext()) {
            if (it.next().equals(compare)){
                ok = true;
            }
        }
        if (ok==false){
            return false;
        }else{
            return true;
    }

    }

    public void showNoteRandom(){
        int index = aleatorio.nextInt(notes.size()+1);
        System.out.println(notes.get(index));
    }
}