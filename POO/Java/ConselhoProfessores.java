import java.util.ArrayList;
import java.util.Iterator;

public class ConselhoProfessores
{
    private ArrayList<Professor> prof;

    public ConselhoProfessores()
    {
        prof = new ArrayList<Professor>();       
    }

    public void addProfessor(String nome, int mat, double sal)
    {
        Professor p = new Professor(nome, mat, sal);
        prof.add(p);
    }

    public void listProfessor(){
        for(int i=0; i<prof.size();i++){
            System.out.println(prof.get(i).getNome());
            //System.out.println(prof.get(i).getSalario());
            //System.out.println(prof.get(i).getMatricula());
        }
    }

    public boolean hasProfessor(String nom){
        boolean achei = false;
        for(int i=0; i<prof.size();i++){
            if (prof.get(i).getNome().equals(nom)){
                achei = true;
            }
        }
        return achei;   
    }

    public void removeProfessor(String nom){
        for(int i=0; i<prof.size();i++){
            if (prof.get(i).getNome().equals(nom)){
                prof.remove(prof.get(i));
            }
        }
    }



}