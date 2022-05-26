import java.util.ArrayList;
import java.util.Iterator;

public class Plano
{
    private ArrayList<Ponto> pontos;

    public Plano()
    {
        pontos = new ArrayList<Ponto>();       
    }

    public void addPonto(double xis, double ipslon)
    {
        Ponto p = new Ponto(xis, ipslon);
        pontos.add(p);
    }

    public void listPontos(){
        for(int i=0; i<pontos.size();i++){
            pontos.get(i).imprime();
        }
    }

    public void removePonto(double xis, double ipslon){
        for(int i=0; i<pontos.size();i++){
            if ((pontos.get(i).getX()==xis) && (pontos.get(i).getY()==ipslon)) {
                pontos.remove(pontos.get(i));
            }
        }
    }

    public boolean verificaPonto(double xis, double ipslon){
        boolean achei = false;
        for(int i=0; i<pontos.size();i++){
            if ((pontos.get(i).getX()==xis) && (pontos.get(i).getY()==ipslon)) {
                achei = true;
            }
        }
        return achei;   
    }

}