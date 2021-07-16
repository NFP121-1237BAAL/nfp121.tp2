package question2;
import question1.PolygoneRegulier;

/**
 * Write a description of class UneUtilisation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


public class UneUtilisation {

  public static void main(String[] args) throws Exception {
    PileI  p1 = new Pile1  (10); 
    PileI  p2 = new Pile2  (10); 
    PileI  p3 = new Pile3  (10);
    PileI  p4 = new Pile4  (10);
    p1.empiler(new PolygoneRegulier(5,10)); 
    p1.empiler(new PolygoneRegulier(3,7)); 
    p2.empiler(p1);
    p3.empiler(p2);
    p4.empiler(p3);
    System.out.println(p1.toString()+p2.toString()+p3.toString()+p4.toString());
    
      
    }}