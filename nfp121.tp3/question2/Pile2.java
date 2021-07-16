package question2;
import java.util.Stack;
import question1.PileVideException;
import question1.PilePleineException;
/**
 * Write a description of class Pile1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pile2 implements PileI
{
    // instance variables - replace the example below with your own
     private Stack<Object> stk;
     private static final int TAILLE_PAR_DEFAUT = 6;
     private int capacite;
    /**
     * Constructor for objects of class Pile1
     */
    
    public Pile2(int taille) {
    if (taille<0)
    taille = TAILLE_PAR_DEFAUT;
    this.capacite=taille;
    this.stk = new Stack();
    stk.ensureCapacity(taille);
  } 
    public Pile2(){
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
       Object ob = stk.push(o);
    }
    public Object depiler() throws PileVideException{
        return stk.pop();
    }
  
    public Object sommet()throws PileVideException{
        return stk.peek();
    }
  public int capacite(){
      return this.capacite;
  }
  public int taille()
  {
      return stk.size();
      
  }
  public boolean estVide(){
      return stk.empty();
  }
  public boolean estPleine(){
      if (stk.capacity()!=stk.size())
      return false;
      return true;
  }
  public boolean equals(Object o){
  if ( this.hashCode() != o.hashCode())
  return false;
  return true;}
  public int hashCode(){
  return capacite+this.taille()+stk.hashCode();
  }
  public String toString(){
      return stk.toString();
  }
  private Object get(int i){
      return stk.get(i);
      
  }
}