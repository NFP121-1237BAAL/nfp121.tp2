package question1;




/**
 * Write a description of class Pile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import question2.PileI;
import java.util.*;
import java.lang.*;
import javax.swing.*;


public class Pile implements PileI{

  public final static int TAILLE_PAR_DEFAUT = 5;

  private Object[] zone;
  private int ptr;
  private int capacite;

  public Pile(int taille) {
    if (taille < 0)
     taille = TAILLE_PAR_DEFAUT;
    this.capacite = taille;
    this.zone = new Object[taille];
    this.ptr = 0;
  }

  public Pile() {
    this(TAILLE_PAR_DEFAUT);
  }

  public void empiler(Object i) throws PilePleineException {
    if(estPleine())
     throw new PilePleineException();
    this.zone[this.ptr] = i;
    this.ptr++;
  }

   public Object depiler() throws PileVideException {
    if (estVide())
      throw new PileVideException();
    this.ptr--;
    return zone[ptr];
  }

  public boolean estVide() {
    return ptr == 0;
  }

  public boolean estPleine() {
    return ptr == zone.length;
  }

  @Override
  public String toString() {
    StringBuffer sb = new StringBuffer("[");
    for (int i = ptr - 1; i >= 0; i--) {
      sb.append((zone[i]).toString());
      if (i > 0)
        sb.append(", ");
    }
    sb.append("]");
    return sb.toString();
  }
  public Object sommet() throws PileVideException{return zone[ptr-1];}
  public int capacite(){return capacite;}
  public int taille(){return ptr;}
  public boolean equals(Object o){
    if ( !(o instanceof Pile) || o == null)
      return false;
    if (this.ptr == getPile(o).taille() && this.capacite == getPile(o).capacite())
    {int x = 0;
    for(int i = 0; i< this.ptr ; i++)
    if( this.zone[i] != getPile(o).zone[i])
    x ++;
    if (x == 0)
    return true;}
    return false;}
    
      public Pile getPile(Object p){
      Pile p1 = (Pile)p;   
      return p1;
     }
  public int hashCode(){
      Vector v = new Vector(ptr);
      for(int i = 0; i<ptr ; i++)
      v.add(zone[i]);
      return this.ptr + this.capacite + v.hashCode();}
}
