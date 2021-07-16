package question2;
import java.util.*;
import question1.PileVideException;
import question1.PilePleineException;
/**
 * Write a description of class Pile3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pile4 implements PileI
{
    // instance variables - replace the example below with your own
    private ArrayList a;
    public final static int TAILLE_PAR_DEFAUT = 6;
    private int capacite;
    /**
     * Constructor for objects of class Pile3
     */
    public Pile4(int taille)
    {
        if(taille<0)
        taille = TAILLE_PAR_DEFAUT;
        a = new ArrayList(taille);
        this.capacite=taille;
    }
    public Pile4()
    {
        this(TAILLE_PAR_DEFAUT);
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
      public void empiler(Object o)throws PilePleineException{
        if (this.estPleine()) throw new PilePleineException();
       a.add(o);
    }
    public Object depiler() throws PileVideException{
        if(this.estVide()) throw new PileVideException();
        Object o = a.get(a.size()-1);
        a.remove(a.size()-1);
        return o;
    }
  
    public Object sommet()throws PileVideException{
        if(this.estVide()) throw new PileVideException();
        return a.get(a.size()-1);
    }
  public int capacite(){
      return this.capacite;
  }
  public int taille()
  {
      return a.size();
      
  }
  public boolean estVide(){
      return a.isEmpty();
  }
  public boolean estPleine(){
      return this.capacite == a.size();
  }
  public boolean equals(Object o){
  if ( this.hashCode() != o.hashCode())
  return false;
  return true;}
  public int hashCode(){
  return (a.hashCode()+capacite+a.size());
  }
  public String toString(){
      return a.toString();
  }
}
