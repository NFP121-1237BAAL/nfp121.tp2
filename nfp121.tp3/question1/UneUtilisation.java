package question1;


/**
 * Write a description of class uneutilisation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UneUtilisation {

  public static void main(String[] args) throws Exception {
    Pile p1 = new Pile(6);
    Pile p2 = new Pile(10);
    // p1 est ici une pile de polygones réguliers PolygoneRegulier.java,
    // entre autres
    p1.empiler(new PolygoneRegulier(4, 100));
    p1.empiler(new PolygoneRegulier(5, 100));
    p1.empiler("polygone");
    p1.empiler(new Integer(100));
    System.out.println(" la pile p1 = " + p1);

    p2.empiler(new Integer(1000));
    p1.empiler(p2);
    System.out.println(" la p1 = " + p1);

    try {
      p1.empiler(new PolygoneRegulier(4, 100));
      // ....
      String s = (String) p1.depiler(); // vérifiez qu'une exception est
                                        // levée à l'exécution
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
