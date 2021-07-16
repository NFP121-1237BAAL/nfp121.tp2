package question2;
import java.util.Vector;
import question1.PileVideException;
import question1.PilePleineException;
/**
 * Write a description of class Pile1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pile3 implements PileI
{
    // instance variables - replace the example below with your own
     private Vector<Object> vct;
     public final static int TAILLE_PAR_DEFAUT = 6;
    /**
     * Constructor for objects of class Pile1
     */
    
    public Pile3(int taille) {
    if (taille<0)
    taille = TAILLE_PAR_DEFAUT;
    this.vct = new Vector(taille);
  } 
    public Pile3(){
    this(TAILLE_PAR_DEFAUT);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void empiler(Object o) throws PilePleineException{
        if (this.estPleine()) throw new PilePleineException();
       Object ob = vct.add(o);
    }
    public Object depiler() throws PileVideException{
        if (vct.size()==0)
        throw new PileVideException();
        Object o = vct.get(vct.size()-1);
        vct.remove(vct.size()-1);
        return o;
    }
  
    public Object sommet() throws PileVideException{
        if (vct.size()==0) throw new PileVideException();
        return vct.elementAt(vct.size()-1);
    }
  public int capacite(){
      return vct.capacity();
  }
  public int taille()
  {
      return vct.size();
      
  }
  public boolean estVide(){
      return vct.isEmpty();
  }
  public boolean estPleine(){
      if (vct.capacity() != vct.size())
      return false;
      return true;
  }
  public boolean equals(Object o){
  if( this.hashCode() != o.hashCode())
   return false;
   return true;}
  public int hashCode(){
  return this.capacite()+this.taille()+ vct.hashCode();
  }
  public String toString(){
      return vct.toString();
  }
}


