package question2;
import question1.Pile;
import question1.PileVideException;
import question1.PilePleineException;
/**
 * Write a description of class Pile3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pile1 implements PileI
{
    // instance variables - replace the example below with your own
    private Pile x;
    public final static int TAILLE_PAR_DEFAUT = 6;
    /**
     * Constructor for objects of class Pile3
     */
    public Pile1(int taille)
    {
        if(taille<0)
        taille = TAILLE_PAR_DEFAUT;
        x = new Pile(taille);
    }
    public Pile1()
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
       x.empiler(o);
    }
    public Object depiler() throws PileVideException{
        if(this.estVide()) throw new PileVideException();
        return x.depiler();
    }
  
    public Object sommet()throws PileVideException{
        if(this.estVide()) throw new PileVideException();
        return x.sommet();
    }
  public int capacite(){
      return x.capacite();
  }
  public int taille()
  {
      return x.taille();
      
  }
  public boolean estVide(){
      return x.estVide();
  }
  public boolean estPleine(){
      return x.estPleine();
  }
  public boolean equals(Object o){
  if ( this.hashCode() != o.hashCode())
  return false;
  return true;}
  public int hashCode(){
  return x.hashCode();
  }
  public String toString(){
      return x.toString();
  }
}